package com.mycompany.DHproject.login.doing;

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

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public void loginDo(loginForm loginForm, loginDTO login) {

		loginDTO test = userDao.test(loginForm.getId());

		System.out.println("form에서 : " + loginForm.getId());
		System.out.println("form에서 : " + loginForm.getPassword());

		System.out.println("들어옴!!!");
	}
}
