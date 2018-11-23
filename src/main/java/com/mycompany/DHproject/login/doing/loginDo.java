package com.mycompany.DHproject.login.doing;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.DHproject.login.dao.DHuserDAO;
import com.mycompany.DHproject.login.dto.loginDTO;
import com.mycompany.DHproject.login.dto.loginForm;

@Controller
public class loginDo {

	@Autowired private DHuserDAO userDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "index";
	}

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public int login(HttpSession session, loginForm loginForm, loginDTO login) {

		List<loginDTO> userInfo = userDao.test(loginForm.getId());
		/*
		 * userInfoFlag 0:아이디 불일치 1:비밀번호 불일치 2:비밀번호 및 아이디가 일치
		 */
		int userInfoFlag = 0;

		if (userInfo.isEmpty()) {
			userInfoFlag = 0;
		} else {
			for (int i = 0; i < userInfo.size(); i++) {
				if (!userInfo.get(i).getUserPw().equals(loginForm.getPassword())) {
					userInfoFlag = 1;
				} else {
					userInfoFlag = 2;
				}
			}
		}

		return userInfoFlag;

	}
}
