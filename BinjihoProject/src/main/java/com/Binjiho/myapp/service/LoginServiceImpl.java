package com.Binjiho.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Binjiho.myapp.dao.LoginDao;
import com.Binjiho.myapp.dto.UserDto;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public UserDto login(String userName) {
		
		return loginDao.login(userName);
	}

}
