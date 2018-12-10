package com.mycompany.DHproject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mycompany.DHproject.login.dto.loginDTO;

public class userCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		HttpSession session = request.getSession(false);

		if (session == null) {
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}

		loginDTO member = (loginDTO) session.getAttribute("userInfo");
		if (member == null) {
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}

		return true;
	}
}
