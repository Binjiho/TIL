package com.Binjiho.myapp.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.Binjiho.myapp.controller.BoardController;

import com.Binjiho.myapp.dao.StoryDao;
import com.Binjiho.myapp.dto.BoardDto;
import com.Binjiho.myapp.dto.StoryDto;
import com.Binjiho.myapp.dto.StoryFileDto;

@Service
public class StoryServiceImpl implements StoryService{
	 private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	   @Autowired
	   StoryDao storyDao;
	   
	   @Override
	   public int storyInsert(StoryDto dto) {
	      return storyDao.storyInsert(dto);
	   }
	   
	   
	   String storyUploadRealPath = 
		         "C:" + File.separator + "Users" + File.separator + "user" + File.separator + 
		         "eclipse-workspace" + File.separator + "BinjihoProject" + File.separator + "src" + File.separator + "main" + File.separator +
		         "webapp" + File.separator + "resources" + File.separator + "storyFiles";
	   
	   String storyDeleteRealPath = 
		         "C:" + File.separator + "Users" + File.separator + "user" + File.separator + 
		         "eclipse-workspace" + File.separator + "BinjihoProject" + File.separator + "src" + File.separator + "main" + File.separator +
		         "webapp" + File.separator;
	   
		   String storyFileFolder = "resources/storyFiles";
		   
		   @Override
		   @Transactional("txManager")
		   public int storyInsertFile(StoryDto dto, MultipartFile file) throws Exception{
		      
		      int storyId = storyDao.storyInsert(dto);
		      logger.debug("storyId : " + storyId);
		      
		      if( file != null ) {
		         //Random Fild Id
		         UUID uuid = UUID.randomUUID();
		         
		         //file extention
		         String extension = FilenameUtils.getExtension(file.getOriginalFilename()); // vs FilenameUtils.getBaseName()
		         
		         String savingFileName = uuid + "." + extension;
		         
		         File saveFile = new File(storyUploadRealPath, savingFileName); 
		         file.transferTo(saveFile);
		   
		         //File Save to folder
		         StoryFileDto fileDto = new StoryFileDto();
		         fileDto.setFileContentType(file.getContentType());
		         
		         
		         logger.debug("fileDto.getFileContentType : " + fileDto.getFileContentType());
		         
		         fileDto.setFileName(file.getOriginalFilename());
		         fileDto.setFileSize(file.getSize());
		         
		         String storyFileUrl = storyFileFolder + "/" + savingFileName;
		         fileDto.setFileUrl(storyFileUrl);
		         
		         fileDto.setStoryId(storyId);
		         
		         storyDao.storyInsertFile(fileDto);
		      }
		      
		      return storyId;
		   }
		   
		  
	   @Override
	   public List<StoryDto> storyList(int limit, int offset) {
	      return storyDao.storyList(limit, offset);
	   }
	   
	   @Override
	   public StoryDto storyDetail(int storyId) {
	      
		   StoryDto dto = storyDao.storyDetail(storyId);
	       List<StoryFileDto> fileList = storyDao.storyDetailFileList(storyId);
	       dto.setFileList(fileList);
	       return dto;
		}

		@Override
		public int storyUpdate(StoryDto dto) {
			return storyDao.storyUpdate(dto);
		}
		
		@Override
		   @Transactional("txManager")
		   public int storyUpdateFile(StoryDto dto, MultipartFile file) throws Exception{
		      
		      int ret = storyDao.storyUpdate(dto);
		      
		      if( file != null ) {
		         //delete first
		         storyDao.storyDeleteFile(dto.getStoryId());
		         
		         //Random Fild Id
		         UUID uuid = UUID.randomUUID();
		         
		         //file extention
		         String extension = FilenameUtils.getExtension(file.getOriginalFilename()); // vs FilenameUtils.getBaseName()
		         
		         String savingFileName = uuid + "." + extension;
		         
		         File saveFile = new File(storyUploadRealPath, savingFileName); 
		         file.transferTo(saveFile);
		   
		         //File Save to folder
		         StoryFileDto fileDto = new StoryFileDto();
		         fileDto.setFileContentType(file.getContentType());
		         
		         
		         logger.debug("fileDto.getFileContentType : " + fileDto.getFileContentType());
		         
		         fileDto.setFileName(file.getOriginalFilename());
		         fileDto.setFileSize(file.getSize());
		         //
		         String boardFileUrl = storyFileFolder + "/" + savingFileName;
		         fileDto.setFileUrl(boardFileUrl);
		         
		         fileDto.setStoryId(dto.getStoryId());
		         
		         storyDao.storyInsertFile(fileDto);
		      }
		      
		      return ret;
		   }

		@Override
		@Transactional("txManager")
		public int storyDelete(StoryDto dto) {

			List<String> fileUrlList = storyDao.storyDeleteFileUrl(dto.getStoryId());
			for(String fileUrl : fileUrlList) {
				File file = new File(storyDeleteRealPath, fileUrl);
				logger.debug("file : " + file.getName());
				
				if(file.exists()) {
					file.delete();
				}
			}
			
			int ret = storyDao.storyDeleteFile(dto.getStoryId());
			storyDao.storyDelete(dto);
			return ret;
		}
		
		 @Override
		   public List<StoryDto> storyList(int limit, int offset, String searchWord) {
		      if("".equals(searchWord)) {
		         return storyDao.storyList(limit, offset);
		      }else {
		         return storyDao.storyListSearchWord(limit, offset, searchWord);
		      }
		   }
		
		 @Override
		   public int storyListTotalCnt() {
		      int cnt = storyDao.storyListTotalCnt();
		      System.out.println(cnt);
		      return cnt;
		   }




	

}
