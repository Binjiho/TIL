package com.Binjiho.myapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.Binjiho.myapp.dto.StoryDto;
import com.Binjiho.myapp.service.StoryService;

@Controller
public class StoryController {
private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
	@Autowired
	StoryService storyService;
	
	@RequestMapping(value="/story/insert", method=RequestMethod.POST)
	@ResponseBody
	public int storyInsert(StoryDto dto) {
		logger.debug("/story/insert");
		System.out.println(dto.toString());
		return storyService.storyInsert(dto);
	}
	
	@RequestMapping(value="/story/insertFile", method=RequestMethod.POST)
	@ResponseBody
	public int storyInsertFile(StoryDto dto, MultipartFile file) throws Exception {
		logger.debug("/story/insertFile");
		
		return storyService.storyInsertFile(dto, file);
	}
	
	

	@RequestMapping(value="/story/list", method=RequestMethod.GET)
	@ResponseBody
	public List<StoryDto> storyList(int limit, int offset, String searchWord) {
		logger.debug("/story/list");
		
		
		return storyService.storyList(limit,offset,searchWord);
	}
	
	@RequestMapping(value="/story/detail", method=RequestMethod.GET)
	@ResponseBody
	public StoryDto storyDetail(int storyId) {
		logger.debug("/story/detail");
		
		
		return storyService.storyDetail(storyId);
	}
	
	@RequestMapping(value="/story/update", method=RequestMethod.POST)
	@ResponseBody
	public int storyUpdate(StoryDto dto) {
		logger.debug("/story/update");
		
		
		return storyService.storyUpdate(dto);
	}
	
   @RequestMapping(value = "/story/updateFile", method = RequestMethod.POST)
   @ResponseBody
   public int storyUpdateFile(StoryDto dto, MultipartFile file) throws Exception{
      
      logger.debug("/story/updateFile");
      
      return storyService.storyUpdateFile(dto, file);
   }
	
	@RequestMapping(value="/story/delete", method=RequestMethod.POST)
	@ResponseBody
	public int storyDelete(StoryDto dto) {
		logger.debug("/story/delete");
		
		
		return storyService.storyDelete(dto);
	}
	
//	@RequestMapping(value="/story/list/totalCnt", method=RequestMethod.GET)
//	@ResponseBody
//	public int storyListCnt(String searchWord) {
//		logger.debug("/story/listTotalCnt");
//		
//		
//		return storyService.storyListTotalCnt(searchWord);
//	}
}
