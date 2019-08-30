package com.shaoxing.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shaoxing.service.impl.UserServiceImpl;

@Controller
public class LoginController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
    public String index() {
        return "/login";
    }
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String Login (@RequestParam("userName") String userName,@RequestParam("passWord") String passWord) {
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName,passWord);
		Subject subject = SecurityUtils.getSubject();
		subject.login(usernamePasswordToken);
		return "index";
		}
	}