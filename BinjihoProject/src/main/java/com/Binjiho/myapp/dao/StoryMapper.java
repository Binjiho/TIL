package com.Binjiho.myapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.jdbc.core.RowMapper;


import com.Binjiho.myapp.dto.StoryDto;

public class StoryMapper implements RowMapper<StoryDto> {
	@Override
	public StoryDto mapRow(ResultSet rs, int count) throws SQLException {

	StoryDto dto = new StoryDto();
    dto.setStoryId(rs.getInt("story_id"));
    dto.setStoryTitle(rs.getString("story_title"));
    dto.setStoryContent(rs.getString("story_content"));
    dto.setUserSeqfk(rs.getString("user_seq_fk"));
    dto.setStoryGoal(rs.getInt("story_goal"));
    dto.setStoryLocation(rs.getString("story_location"));
    dto.setStoryFileUrl(rs.getString("file_url"));
    System.out.println(dto.getStoryFileUrl());
    //dto.setStoryUrl(rs.getString("story_url"));;

    Calendar cal= new GregorianCalendar();
    dto.setRegDt(rs.getDate("reg_dt",cal));
    //dto.setReadCount(rs.getInt("read_count"));
    //System.out.println("dto.getRegDt :" + dto.getRegDt());
    return dto;
 }   
}
