package com.shaoxing.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shaoxing.service.UserService;
import com.shaoxing.view.JsonResult;

@Controller
@RequestMapping
public class LoginController {
	@Autowired
	private UserService userService;
	@GetMapping(value = "/toLogin")
	public String toLogin() {
		return "login";
		
	}
	@ResponseBody
	@PostMapping(value = "/loginRest")
	public JsonResult loginRest(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, passWord);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(usernamePasswordToken);
		} catch (IncorrectCredentialsException ice) {
			return JsonResult.error("用户名或密码错误");
		}catch (UnknownAccountException uae) {
			return JsonResult.error("用户不存在");
        }
		System.out.println("end");
		return JsonResult.success("登录成功！");
	}
}