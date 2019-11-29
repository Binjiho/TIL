package com.Binjiho.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Binjiho.myapp.dao.UserDao;
import com.Binjiho.myapp.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	   @Autowired
	   UserDao userDao;
	   
	   @Override
	   public int userRegister(UserDto userDto) {
	      // TODO Auto-generated method stub
	      return userDao.userRegister(userDto);
	   }

	}



