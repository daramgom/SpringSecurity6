package com.itwillbs.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

/*
 *  접근 권한이 없을 경우 처리하는 객체
 *  
 */

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	private static final Logger logger = LoggerFactory.getLogger(CustomAccessDeniedHandler.class);
	
	@Override
	public void handle(HttpServletRequest req, HttpServletResponse res,
			AccessDeniedException ade) throws IOException, ServletException {
		logger.info(" ( •̀ ω •́ )✧ handle() 실행 ");
		logger.info(" ( •̀ ω •́ )✧ 접근권한이 없는 접근(호출) 발생 ");
		
		// 안전한 페이지로의 이동
		res.sendRedirect("/sample/all");
		
	}
	
}//class
