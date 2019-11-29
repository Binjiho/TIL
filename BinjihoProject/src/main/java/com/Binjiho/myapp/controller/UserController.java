package com.Binjiho.myapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Binjiho.myapp.HomeController;
import com.Binjiho.myapp.dto.UserDto;
import com.Binjiho.myapp.service.UserService;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user/form",method=RequestMethod.GET)
	public String registerForm() {
		logger.debug("/user/form");
		
		return "user/register";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	@ResponseBody
	public int register(UserDto userDto) {
		logger.debug("/user");
		
		return userService.userRegister(userDto);
	}
}
