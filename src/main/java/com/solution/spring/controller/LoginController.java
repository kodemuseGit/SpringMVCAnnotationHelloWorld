package com.solution.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class LoginController {

	@RequestMapping(path = "login")
	public String doLogin() {
		return "login";
	}
}
