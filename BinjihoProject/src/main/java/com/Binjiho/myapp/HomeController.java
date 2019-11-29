package com.Binjiho.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		logger.info("Welcome Main! The client locale is {}.", locale);
		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
//		String str = null;
//		str.length();
		
		return "main";
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		logger.info("Welcome Login! The client locale is {}.", locale);
				
				Date date = new Date();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
				
				String formattedDate = dateFormat.format(date);
				
				model.addAttribute("serverTime", formattedDate );
				
				return "/user/login2";
	}
	
	
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		
		logger.info("Welcome Register! The client locale is {}.", locale);
				
				Date date = new Date();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
				
				String formattedDate = dateFormat.format(date);
				
				model.addAttribute("serverTime", formattedDate );
				
				return "/user/register";
	}
	
	@RequestMapping(value="/volunteer", method = RequestMethod.GET)
	public String volunteer(Locale locale, Model model) {
		
		logger.info("Welcome Volunteer! The client locale is {}.", locale);
				
				Date date = new Date();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
				
				String formattedDate = dateFormat.format(date);
				
				model.addAttribute("serverTime", formattedDate );
				
				//return "volunteer";
				return "board/boardFile";
	}
	
	@RequestMapping(value="/charity", method = RequestMethod.GET)
	public String charity(Locale locale, Model model) {
		
		logger.info("Welcome Charity! The client locale is {}.", locale);
				
				Date date = new Date();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
				
				String formattedDate = dateFormat.format(date);
				
				model.addAttribute("serverTime", formattedDate );
				
				return "charity";
	}
	
	@RequestMapping(value="/gallery", method = RequestMethod.GET)
	public String gallery(Locale locale, Model model) {
		
		logger.info("Welcome Gallery! The client locale is {}.", locale);
				
				Date date = new Date();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
				
				String formattedDate = dateFormat.format(date);
				
				model.addAttribute("serverTime", formattedDate );
				
				return "gallery";
	}
	
	@RequestMapping(value="/detailcharity", method = RequestMethod.GET)
	public String detailcharity(Locale locale, Model model) {
		
		logger.info("Welcome DetailCharity Page! The client locale is {}.", locale);
				
				Date date = new Date();
				DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
				
				String formattedDate = dateFormat.format(date);
				
				model.addAttribute("serverTime", formattedDate );
				
				return "detailcharity";
	}
	@RequestMapping(value="/cardforkid", method = RequestMethod.GET)
	public String cardforkid(Locale locale, Model model) {
		
		logger.info("/cardforkid");
				
				return "cardforkid";
	}
	
	@RequestMapping(value="/board", method = RequestMethod.GET)
	public String board(Locale locale, Model model) {
		
		logger.info("/board");
				
		return "board/board";
	}
   
	@RequestMapping(value = "/map", method = RequestMethod.GET)
   public String boardDropzone(HttpSession session) {
      logger.info("/map");
      return "map/googleMapInfo";
   }
}
