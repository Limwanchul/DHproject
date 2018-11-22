package com.mycompany.DHproject.login.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class DHuserDAO {

	@Resource(name = "sqlSession") private SqlSession masterSession;

	public String test(String userId) {

		String result = masterSession.selectOne("getUserInfo", userId);
		return result;
	}
}
