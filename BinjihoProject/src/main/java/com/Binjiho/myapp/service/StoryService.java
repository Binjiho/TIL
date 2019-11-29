package com.Binjiho.myapp.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.Binjiho.myapp.dto.StoryDto;

public interface StoryService {

	int storyInsert(StoryDto dto);
	
	public List<StoryDto> storyList(int limit, int offset);
	public StoryDto storyDetail(int storyId);
	public int storyUpdate(StoryDto dto);
	public int storyDelete(StoryDto dto);

	int storyListTotalCnt();
	public int storyInsertFile(StoryDto dto, MultipartFile file) throws Exception;

	int storyUpdateFile(StoryDto dto, MultipartFile file) throws Exception;

	List<StoryDto> storyList(int limit, int offset, String searchWord);




	
}
