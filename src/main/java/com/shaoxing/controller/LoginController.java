package com.shaoxing.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shaoxing.service.UserService;

@Controller
@RequestMapping
public class LoginController {
	@Autowired
	private UserService userService;
	@GetMapping(value = "/toLogin")
	public String toLogin() {
		return "login";
		
	}
	@PostMapping(value = "/loginRest")
	public String loginRest(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, passWord);
		Subject subject = SecurityUtils.getSubject();
		subject.login(usernamePasswordToken);
		System.out.println("end");
		return "index";
	}
}