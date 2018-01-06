package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/")
@Controller
public class Welcome {
	//method level mapping must exist for this to work even if we have class level mapping
	@RequestMapping(value="/")
	public String welcome() {
		return "welcome";
	}
}
