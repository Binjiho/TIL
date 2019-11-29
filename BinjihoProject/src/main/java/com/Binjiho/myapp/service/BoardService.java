package com.Binjiho.myapp.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.Binjiho.myapp.dto.BoardDto;

public interface BoardService {
	public int boardInsert(BoardDto dto);
	
	
	public BoardDto boardDetail(int boardId);
	public int boardUpdate(BoardDto dto);
	public int boardDelete(BoardDto dto);

	
	public int boardInsertFile(BoardDto dto, MultipartFile file) throws Exception;

	int boardUpdateFile(BoardDto dto, MultipartFile file) throws Exception;

	List<BoardDto> boardList(int limit, int offset, String searchWord);

	int boardListTotalCnt(String searchWord);


	//BoardDto boardDetail(int boardId, int userSeq);
	
}
