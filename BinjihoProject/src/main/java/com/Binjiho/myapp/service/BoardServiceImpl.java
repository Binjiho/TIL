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
import com.Binjiho.myapp.dao.BoardDao;
import com.Binjiho.myapp.dto.BoardDto;
import com.Binjiho.myapp.dto.BoardFileDto;

@Service
public class BoardServiceImpl implements BoardService{
	   private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	   @Autowired
	   BoardDao boardDao;
	   
	   @Override
	   public int boardInsert(BoardDto dto) {
	      return boardDao.boardInsert(dto);
	   }
	   
	   String boardUploadRealPath = 
		         "C:" + File.separator + "Users" + File.separator + "user" + File.separator + 
		         "eclipse-workspace" + File.separator + "BinjihoProject" + File.separator + "src" + File.separator + "main" + File.separator +
		         "webapp" + File.separator + "resources" + File.separator + "boardFiles";
	   
	   String boardDeleteRealPath = 
		         "C:" + File.separator + "Users" + File.separator + "user" + File.separator + 
		         "eclipse-workspace" + File.separator + "BinjihoProject" + File.separator + "src" + File.separator + "main" + File.separator +
		         "webapp" + File.separator;
	   
		   String boardFileFolder = "resources/boardFiles";
		   
		   @Override
		   @Transactional("txManager")
		   public int boardInsertFile(BoardDto dto, MultipartFile file) throws Exception{
		      
		      int boardId = boardDao.boardInsert(dto);
		      logger.debug("boardId : " + boardId);
		      
		      if( file != null ) {
		         //Random Fild Id
		         UUID uuid = UUID.randomUUID();
		         
		         //file extention
		         String extension = FilenameUtils.getExtension(file.getOriginalFilename()); // vs FilenameUtils.getBaseName()
		         
		         String savingFileName = uuid + "." + extension;
		         
		         File saveFile = new File(boardUploadRealPath, savingFileName); 
		         file.transferTo(saveFile);
		   
		         //File Save to folder
		         BoardFileDto fileDto = new BoardFileDto();
		         fileDto.setFileContentType(file.getContentType());
		         
		         
		         logger.debug("fileDto.getFileContentType : " + fileDto.getFileContentType());
		         
		         fileDto.setFileName(file.getOriginalFilename());
		         fileDto.setFileSize(file.getSize());
		         
		         String boardFileUrl = boardFileFolder + "/" + savingFileName;
		         fileDto.setFileUrl(boardFileUrl);
		         
		         fileDto.setBoardId(boardId);
		         
		         boardDao.boardInsertFile(fileDto);
		      }
		      
		      return boardId;
		   }
//	   @Override
//	   public List<BoardDto> boardList(int limit, int offset) {
//	      return boardDao.boardList(limit, offset);
//	   }
	   
	   @Override
	   public BoardDto boardDetail(int boardId) {
	      
		   BoardDto dto = boardDao.boardDetail(boardId);
	       List<BoardFileDto> fileList = boardDao.boardDetailFileList(boardId);
	       dto.setFileList(fileList);
	       return dto;
		}
		   
		
//		   @Override
//		   public BoardDto boardDetail(int boardId, int userSeq) {
//		      //조회수 처리
//		      int viewCnt = boardDao.boardUserReadCnt(boardId, userSeq);
//		      
//		      if( viewCnt == 0 ) {
//		         boardDao.boardInsertUserRead(boardId, userSeq);
//		         boardDao.boardUpdateReadCnt(boardId);
//		      }
//		      
//		      BoardDto dto = boardDao.boardDetail(boardId);
//		      List<BoardFileDto> fileList = boardDao.boardDetailFileList(dto.getBoardId());
//		      dto.setFileList(fileList);
//		      return dto;
//		   }
   

		@Override
		public int boardUpdate(BoardDto dto) {
			return boardDao.boardUpdate(dto);
		}
		
		@Override
		   @Transactional("txManager")
		   public int boardUpdateFile(BoardDto dto, MultipartFile file) throws Exception{
		      
		      int ret = boardDao.boardUpdate(dto);
		      
		      if( file != null ) {
		         //delete first
		         boardDao.boardDeleteFile(dto.getBoardId());
		         
		         //Random Fild Id
		         UUID uuid = UUID.randomUUID();
		         
		         //file extention
		         String extension = FilenameUtils.getExtension(file.getOriginalFilename()); // vs FilenameUtils.getBaseName()
		         
		         String savingFileName = uuid + "." + extension;
		         
		         File saveFile = new File(boardUploadRealPath, savingFileName); 
		         file.transferTo(saveFile);
		   
		         //File Save to folder
		         BoardFileDto fileDto = new BoardFileDto();
		         fileDto.setFileContentType(file.getContentType());
		         
		         
		         logger.debug("fileDto.getFileContentType : " + fileDto.getFileContentType());
		         
		         fileDto.setFileName(file.getOriginalFilename());
		         fileDto.setFileSize(file.getSize());
		         
		         String boardFileUrl = boardFileFolder + "/" + savingFileName;
		         fileDto.setFileUrl(boardFileUrl);
		         
		         fileDto.setBoardId(dto.getBoardId());
		         
		         boardDao.boardInsertFile(fileDto);
		      }
		      
		      return ret;
		   }
	
		@Override
		@Transactional("txManager")
		public int boardDelete(BoardDto dto) {

			List<String> fileUrlList = boardDao.boardDeleteFileUrl(dto.getBoardId());
			for(String fileUrl : fileUrlList) {
				File file = new File(boardDeleteRealPath, fileUrl);
				logger.debug("file : " + file.getName());
				
				if(file.exists()) {
					file.delete();
				}
			}
			
			int ret = boardDao.boardDeleteFile(dto.getBoardId());
			boardDao.boardDelete(dto);
			return ret;
		}
		
//		 @Override
//		   public int boardListTotalCnt() {
//		      int cnt = boardDao.boardListTotalCnt();
//		      System.out.println(cnt);
//		      return cnt;
//		   }
		 @Override
		   public List<BoardDto> boardList(int limit, int offset, String searchWord) {
		      if("".equals(searchWord)) {
		         return boardDao.boardList(limit, offset);
		      }else {
		         return boardDao.boardListSearchWord(limit, offset, searchWord);
		      }
		   }
		   
		   @Override
		   public int boardListTotalCnt(String searchWord) {
		      
		      if("".equals(searchWord)) {
		         return boardDao.boardListTotalCnt();
		      }else {
		         return boardDao.boardListSearchWordTotalCnt(searchWord);
		      }
		   }

		
	}