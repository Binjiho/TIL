package com.Binjiho.myapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Binjiho.myapp.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	   JdbcTemplate jdbcTemplate;
	   
	   @Override
	   public int userRegister(UserDto userDto) {
	      
	      String sql =
	      "INSERT INTO USER " +
	      " (USER_NAME, USER_PASSWORD, USER_EMAIL, USER_PROFILE_IMAGE_URL, USER_REGISTER_DATE) " +
	      " VALUES (?,?,?,?,now() )";
	      return jdbcTemplate.update(sql, userDto.getUserName(), userDto.getUserPassword(), userDto.getUserEmail(), userDto.getUserProfileImageUrl());
	   }
	}