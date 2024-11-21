package com.itwillbs.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

// NoOpPasswordEncoder 객체 => {noop} 비밀번호 형태를 처리하는 객체
// 	=> 시큐리티 5버전부터 사용불가
public class CustomNoopPasswordEncoder implements PasswordEncoder {
	private static final Logger logger = LoggerFactory.getLogger(CustomNoopPasswordEncoder.class);

	@Override
	public String encode(CharSequence rawPassword) {
		logger.info(" ( •̀ ω •́ )✧ 암호화 처리 ");
		
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		logger.info(" ( •̀ ω •́ )✧ 기존의 비밀번호, 암호화된 비밀번호 비교 ");
		
		return rawPassword.toString().equals(encodedPassword);
	}
	
	
}
