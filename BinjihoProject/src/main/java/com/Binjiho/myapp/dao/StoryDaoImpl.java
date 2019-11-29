package com.Binjiho.myapp.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


import com.Binjiho.myapp.dto.StoryDto;
import com.Binjiho.myapp.dto.StoryFileDto;

@Repository
public class StoryDaoImpl implements StoryDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	@Override
//	public int boardInsert(BoardDto dto) {
//		String sql = 
//				"insert into board ( "
//				+ "USER_SEQ, USER_NAME, TITLE, CONTENT, REG_DT, READ_COUNT) "
//				+ "values(?,?,?,?,now(),0)";
//		return jdbcTemplate.update(
//				sql,
//				dto.getUserSeq(),
//				dto.getUserName(),
//				dto.getTitle(),
//				dto.getContent()
//		);
//	
//	}
	@Override
	   public int storyInsert(StoryDto dto) {
	      
	      KeyHolder keyHolder = new GeneratedKeyHolder();
	      
	      String sql = 
	              "insert into story ( "
	            + "USER_SEQ_FK, STORY_TITLE, STORY_CONTENT, REG_DT, STORY_GOAL, STORY_LOCATION) "
	            + "values ( ?, ?, ?, now(), ?, ? )";
	      
	      
	      jdbcTemplate.update(connection -> {
	         PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	         ps.setString(1, dto.getUserSeqfk());
	         ps.setString(2, dto.getStoryTitle());
	         ps.setString(3, dto.getStoryContent());
	         ps.setInt(4, dto.getStoryGoal());
	         ps.setString(5, dto.getStoryLocation());
	         return ps;
	      }, keyHolder);
	    
	      return keyHolder.getKey().intValue();

	   }
	
	@Override
	   public int storyInsertFile(StoryFileDto dto) {
	      String sql = 
	              "insert into story_file ( "
	            + "STORY_ID, FILE_NAME, FILE_SIZE, FILE_CONTENT_TYPE, FILE_URL) "
	            + "values ( ?, ?, ?, ?, ? )";
	      
	      return jdbcTemplate.update(
	            sql, 
	            dto.getStoryId(),
	            dto.getFileName(),
	            dto.getFileSize(),
	            dto.getFileContentType(),
	            dto.getFileUrl()
	      );
	   }

	@Override
	public List<StoryDto> storyList(int limit, int offset) {
		//SQL_CALC_FOUND_ROWS - SELECT FOUND_ROWS()
		String sql = 
				"SELECT SQL_CALC_FOUND_ROWS A.* FROM ( " +
				" SELECT s.STORY_ID, " +
				"        s.STORY_TITLE, " +
				"        s.STORY_CONTENT, " +
				"        s.USER_SEQ_FK, " +
				"        U.USER_NAME, " +
				"        U.USER_PROFILE_IMAGE_URL, " +
//				"        s.STORY_URL, " +
				"        s.STORY_GOAL, " +
				"        s.STORY_LOCATION, " +
				"        s.REG_DT, " +
				"        (select FILE_URL from story_file where s.STORY_ID = story_id) FILE_URL " +
				
				" FROM story s, user u " +
				" WHERE s.USER_SEQ_FK = u.USER_SEQ " +
				" ORDER BY STORY_ID DESC " +
				") A LIMIT ? OFFSET ?; ";
		return jdbcTemplate.query(sql, new StoryMapper(), limit, offset);
	}
	
	@Override
	public int storyListTotalCnt() {
		String sql = "SELECT count(*) FROM story ";
		 return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	//Detail

	@Override
	public StoryDto storyDetail(int storyId) {
		String sql =
				" SELECT s.STORY_ID, " +
				"        s.STORY_TITLE, " +
				"        s.STORY_CONTENT, " +
				"        s.USER_SEQ_FK, " +
				"        U.USER_NAME, " +
				"        U.USER_PROFILE_IMAGE_URL, " +
//				"        s.STORY_URL, " +
				"        s.REG_DT " +
				" FROM story s, user u " +
				" WHERE s.USER_SEQ_FK = u.USER_SEQ " +
				" AND s.STORY_ID = ? ";
		return jdbcTemplate.queryForObject(sql, new StoryMapper(), storyId);
	}
	
	@Override
	   public List<StoryFileDto> storyDetailFileList(int storyId) {
	      String sql = 
	            "   SELECT  STORY_ID,  " +
	            "         FILE_ID, " +
	            "           FILE_NAME, " +
	            "           FILE_SIZE, " +
	            "           FILE_CONTENT_TYPE, " +
	            "           FILE_URL, " +
	            "           REG_DT " +
	            "    FROM story_file " +
	            "   WHERE STORY_ID = ? ";
	      
	      return jdbcTemplate.query(sql, new StoryFileListMapper(), storyId);
	   }

	//update
	@Override
	public int storyUpdate(StoryDto dto) {
		String sql =
				" update story " +
			    " set STORY_TITLE = ? , STORY_CONTENT = ? " +
				" where STORY_ID = ? ";
		return jdbcTemplate.update(sql, dto.getStoryTitle(), dto.getStoryContent(), dto.getStoryId());
	}
	
	//delete
	@Override
	public int storyDelete(StoryDto dto) {
		String sql =
				" delete from story " +
				" where STORY_ID = ? ";
		return jdbcTemplate.update(sql, dto.getStoryId());
	}

	
	
	@Override
	   public int storyDeleteFile(int storyId) {
	      String sql = 
	              "delete from story_file "
	            + "where STORY_ID = ? ";
	      
	      return jdbcTemplate.update(
	            sql, 
	            storyId
	      );
	   }
	
	@Override
	   public List<String> storyDeleteFileUrl(int storyId) {
	      String sql = 
	              "select file_url from story_file "
	            + "where STORY_ID = ? ";
	      
	      return jdbcTemplate.queryForList(sql,String.class,storyId);
	   }

	@Override
	public List<StoryDto> storyListSearchWord(int limit, int offset, String searchWord) {
		String likeSearchWord = "%" + searchWord + "%";

	      String sql = 
	            "SELECT SQL_CALC_FOUND_ROWS A.* FROM ( " +
	            "   SELECT  s.STORY_ID,  " +
	            "         s.USER_SEQ_FK, " +
	            "         u.USER_NAME, " +
	            "         u.USER_PROFILE_IMAGE_URL, " +
	            "           s.STORY_TITLE, " +
	            "           s.STORY_CONTENT, " +
	            "           s.REG_DT, " +
	            "           s.READ_COUNT " +
	            "    FROM story s, user u " +
	            "   WHERE s.STORY_TITLE LIKE ? " +
	            "     AND s.USER_SEQ_FK = u.USER_SEQ " +
	            "    ORDER BY STORY_ID DESC " +
	            ") A LIMIT ? OFFSET ?; ";

	      return jdbcTemplate.query(sql, new StoryMapper(), likeSearchWord, limit, offset);
	   }
	}
	
	

