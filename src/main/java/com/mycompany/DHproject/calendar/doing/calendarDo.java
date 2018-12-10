package com.mycompany.DHproject.calendar.doing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class calendarDo {

	@RequestMapping(value = "/calendar", method = { RequestMethod.POST, RequestMethod.GET })
	public String calendar() {

		return "/calendar/calendar";
	}

}
