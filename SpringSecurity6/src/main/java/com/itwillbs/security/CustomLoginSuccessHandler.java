package com.itwillbs.security;
/*
 * 로그인 성공시 처리하는 동작
 * (로그인된 계정 정보에 따른 페이지 이동)
 * 
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomLoginSuccessHandler.class);

	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res,
			Authentication auth) throws IOException, ServletException {
		logger.info(" ( •̀ ω •́ )✧ 인증 성공 => 로그인 성공 ");
		
		// 로그인한 사용자의 권한 체크
		List<String> roleNames = new ArrayList<String>();
		
		// 람다표현식
		auth.getAuthorities()
			.forEach(authority -> roleNames.add(authority.getAuthority()));
		
		// 익명클래스
		/*
		auth.getAuthorities().forEach(new Consumer<GrantedAuthority>() {
			@Override
			public void accept(GrantedAuthority authority) {
				roleNames.add(authority.getAuthority());
			}
		});
		*/
		logger.info(" ( •̀ ω •́ )✧ roleNames : {} ",roleNames);
		
		// 권한에 따른 페이지 이동
		if(roleNames.contains("ROLE_ADMIN")) {// ROLE_ADMIN 권한이 있을 때
			logger.info(" ( •̀ ω •́ )✧ 관리자 로그인 성공 ");
			
			res.sendRedirect("/sample/admin");
			return;
		}
		
		if(roleNames.contains("ROLE_MEMBER")) {
			logger.info(" ( •̀ ω •́ )✧ 일반 회원 로그인 성공 ");
			res.sendRedirect("/sample/member");
			return;
		}
		
		// 비회원 사용자
		logger.info(" ( •̀ ω •́ )✧ 비회원 접근 ");
		res.sendRedirect("/sample/all");
	}
	
	
	
}// class
