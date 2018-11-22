package com.mycompany.DHproject.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.DHproject.login.dto.loginDTO;

@Repository
public class DHuserDAO {

	private SqlSession masterSession;

	public loginDTO test(String userId) {

		return (loginDTO) masterSession.selectOne("getUserInfo", userId);
	}
}
