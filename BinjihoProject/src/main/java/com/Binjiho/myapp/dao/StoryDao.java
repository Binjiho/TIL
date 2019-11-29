package com.Binjiho.myapp.dao;

import java.util.List;



import com.Binjiho.myapp.dto.StoryDto;
import com.Binjiho.myapp.dto.StoryFileDto;

public interface StoryDao {
	int storyInsert(StoryDto dto);
	
	List<StoryDto> storyList(int start, int end);
	StoryDto storyDetail(int storyId);
	int storyUpdate(StoryDto dto);
	int storyDelete(StoryDto dto);

	int storyListTotalCnt();

	int storyInsertFile(StoryFileDto dto);

	List<StoryFileDto> storyDetailFileList(int storyId);

	int storyDeleteFile(int storyId);

	List<String> storyDeleteFileUrl(int storyId);

	List<StoryDto> storyListSearchWord(int limit, int offset, String searchWord);

	

	
}
