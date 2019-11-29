package com.Binjiho.myapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Binjiho.myapp.dto.UserDto;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	   JdbcTemplate jdbcTemplate;
	   
	   @Override
//	   public String login(String userName) {
//	      System.out.println(userName);      
//	      String sql = 
//	            "SELECT USER_PASSWORD as userPassword " + 
//	            "  FROM USER " + 
//	            " WHERE USER_NAME = ? ";
//	      
//	      String userPassword = null;
//	      
//	      try{
//	         userPassword = jdbcTemplate.queryForObject(sql, String.class, userName);
//	      }catch(org.springframework.dao.EmptyResultDataAccessException e) {
//	         userPassword = "-1";
//	      }
//	      
//	      return userPassword;
//	   }
	   
	   public UserDto login(String userName) {
		   UserDto dto = null;
		   String sql = 
		            "SELECT USER_SEQ,USER_NAME , USER_PASSWORD, USER_EMAIL, USER_PROFILE_IMAGE_URL, USER_REGISTER_DATE , MANAGER_CODE" + 
		            "  FROM USER " + 
		            " WHERE USER_NAME = ? ";
		   try {
			   dto = jdbcTemplate.queryForObject(sql, new UserMapper(), userName);
		   }catch(EmptyResultDataAccessException e) {
			   dto = null;
		   }
		   return dto;
	   }
}
	
