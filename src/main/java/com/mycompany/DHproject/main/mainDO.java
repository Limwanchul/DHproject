package com.mycompany.DHproject.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainDO {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {

		System.out.println("main들어왔다!");
		return "/main/main";

	}

}
