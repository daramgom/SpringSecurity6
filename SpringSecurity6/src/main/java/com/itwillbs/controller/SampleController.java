package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/")
// @Log4J
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@GetMapping(value = "/all")
	public void doAll() {
		logger.debug(" ( •̀ ω •́ )✧ doAll() 실행 ");
	}
	
	@GetMapping(value = "/member")
	public void doMember() {
		logger.debug(" ( •̀ ω •́ )✧ doMember() 실행 ");
	}
	
	@GetMapping(value = "/admin")
	public void doAdmin() {
		logger.debug(" ( •̀ ω •́ )✧ doAdmin() 실행 ");
	}
	
	
}
