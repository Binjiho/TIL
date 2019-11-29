package com.Binjiho.myapp.dao;

import java.util.List;

import com.Binjiho.myapp.dto.BoardDto;
import com.Binjiho.myapp.dto.BoardFileDto;

public interface BoardDao {
	int boardInsert(BoardDto dto);
	
	List<BoardDto> boardList(int start, int end);
	BoardDto boardDetail(int boardId);
	int boardUpdate(BoardDto dto);
	int boardDelete(BoardDto dto);

	int boardListTotalCnt();

	int boardInsertFile(BoardFileDto dto);

	List<BoardFileDto> boardDetailFileList(int boardId);

	int boardDeleteFile(int boardId);

	List<String> boardDeleteFileUrl(int boardId);

	List<BoardDto> boardListSearchWord(int limit, int offset, String searchWord);

	int boardListSearchWordTotalCnt(String searchWord);

//	int boardUserReadCnt(int boardId, int userSeq);
//
//	int boardInsertUserRead(int boardId, int userSeq);
//
//	int boardUpdateReadCnt(int boardId);
}
