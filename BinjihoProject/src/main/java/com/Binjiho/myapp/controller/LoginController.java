package com.Binjiho.myapp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Binjiho.myapp.dto.UserDto;
import com.Binjiho.myapp.service.LoginService;
import com.Binjiho.myapp.service.UserService;

@Controller
public class LoginController {

   private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
   
   @Autowired
   LoginService loginService;
//
//   @RequestMapping(value = "/login", method = RequestMethod.POST)
//   @ResponseBody
//   public String login(String userName, String userPassword) {
//      
//      logger.debug("/login2");
//      UserDto dto = 
//      String pwd = loginService.login(userName);
//
//      if(pwd.equals(userPassword)) {
//         return "true";
//      }else {
//         return "false";
//      }
//   }


   @RequestMapping(value = "/login", method = RequestMethod.POST)
   @ResponseBody
   public String login(HttpSession session, String userName, String userPassword) {
      
      logger.debug("/login2");
      UserDto dto = loginService.login(userName);

      if(dto.getUserPassword().equals(userPassword)) {
         session.setAttribute("userDto", dto);
    	  return "true";
      }else {
         return "false";
      }
   }
   
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		
	session.invalidate();
				
				return "main";
	}
	

 
}