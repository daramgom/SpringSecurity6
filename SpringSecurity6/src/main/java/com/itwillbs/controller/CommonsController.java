package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonsController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonsController.class);
	
	@GetMapping(value = "/accessErr")
	public void accessErr(Authentication auth) throws Exception {
		logger.info(" ( •̀ ω •́ )✧ accessErr() 실행 ");
		logger.info(" ( •̀ ω •́ )✧ auth : {} ",auth);
		logger.info(" ( •̀ ω •́ )✧ /accessErr.jsp 뷰페이지 이동 ");
	}
	
	@GetMapping(value = "/customLogin")
	public void myLogin() throws Exception {
		logger.info(" ( •̀ ω •́ )✧ myLogin() 실행 ");
		logger.info(" ( •̀ ω •́ )✧ /customLogin.jsp 뷰페이지 이동 ");
	}
	
	@GetMapping(value = "/customLogout")
	public void myLogout() throws Exception {
		logger.info(" ( •̀ ω •́ )✧ myLogout() 실행 ");
		logger.info(" ( •̀ ω •́ )✧ /customLogout.jsp 뷰페이지 이동 ");
		
		// return "redirect:/sample/all";
	}
	
}
