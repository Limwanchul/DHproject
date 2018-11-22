package com.mycompany.DHproject.login.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.DHproject.login.dto.loginDTO;

@Repository
public class DHuserDAO {

	@Resource(name = "sqlSession") private SqlSession masterSession;

	public List<loginDTO> test(String userId) {

		List<loginDTO> result = masterSession.selectList("getUserInfo", userId);
		return result;
	}
}
