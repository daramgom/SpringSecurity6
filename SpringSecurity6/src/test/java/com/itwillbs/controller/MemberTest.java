package com.itwillbs.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml",
				"file:src/main/webapp/WEB-INF/spring/security-context.xml" }
			)

public class MemberTest {

	@Inject
	private DataSource ds;
	
	// 암호화 처리 객체
	@Inject
	private PasswordEncoder pwEncoder;

	/* @Test
	public void insertMemberTest() throws Exception {
		for (int i = 0; i < 100; i++) {
			// 1.2. 디비연결
			Connection con = ds.getConnection();

			// 3. sql 구문 & pstmt 객체
			String sql = "insert into tbl_member(userid,userpw,username,useremail) " + " values(?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(sql);

			// 3-1. ??? pstmt 값 설정
			// 비밀번호 (암호화)
			pstmt.setString(2, pwEncoder.encode("pw"+i));
			
			if( i < 80 ) {
				pstmt.setString(1, "user0"+i);
				pstmt.setString(3, "사용자"+i);
				pstmt.setString(4, "user0"+i+"@users0"+i+".com");
			} else if( i < 90) {
				pstmt.setString(1, "manager0"+i);
				pstmt.setString(3, "매니저"+i);
				pstmt.setString(4, "manager0"+i+"@manager0"+i+".com");
			} else {
				pstmt.setString(1, "admin0"+i);
				pstmt.setString(3, "관리자"+i);
				pstmt.setString(4, "admin0"+i+"@admin0"+i+".com");
			}

			// 4. 실행
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
		}
	}
	*/
	
	/*
	@Test
	public void insertAuthMemberTest() throws Exception {
		for (int i = 0; i < 100; i++) {
			// 1.2. 디비연결
			Connection con = ds.getConnection();

			// 3. sql 구문 & pstmt 객체
			String sql = "insert into tbl_member_auth(userid,auth) values(?,?)";

			PreparedStatement pstmt = con.prepareStatement(sql);

			// 3-1. ??? pstmt 값 설정
			
			if( i < 80 ) {
				pstmt.setString(1, "user0"+i);
				pstmt.setString(2, "ROLE_USER");
			} else if( i < 90) {
				pstmt.setString(1, "manager0"+i);
				pstmt.setString(2, "ROLE_MANAGER");
			} else {
				pstmt.setString(1, "admin0"+i);
				pstmt.setString(2, "ROLE_ADMIN");
			}

			// 4. 실행
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
		}
	}
	*/
	
	/*
	@Test
	public void insertMemberTest() throws Exception {
			// 1.2. 디비연결
			Connection con = ds.getConnection();

			// 3. sql 구문 & pstmt 객체
			String sql = "insert into tbl_member(userid,userpw,username,useremail) " + " values(?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(sql);

			// 3-1. ??? pstmt 값 설정
			// 비밀번호 (암호화)
			pstmt.setString(1, "admin100");
			pstmt.setString(2, pwEncoder.encode("pw99"));
			pstmt.setString(3, "admin100");
			pstmt.setString(4, "admin100@admin100.com");
			

			// 4. 실행
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
	}
	*/
	
	

}// class
