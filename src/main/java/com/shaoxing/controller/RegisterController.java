package com.shaoxing.controller;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shaoxing.service.UserService;
import com.shaoxing.view.JsonResult;

@Controller
@RequestMapping("/rest")
public class RegisterController {
	@Autowired
	private UserService userService;
	@PostMapping(value ="/register")
	public JsonResult register(@RequestParam("userName")String userName,@RequestParam("passWord")String passWord,
			@RequestParam("name")String name,@RequestParam("passWordVerify")String passWordVerify){
		if(passWord != passWordVerify) {
			return JsonResult.error("两次输入密码不一致，请重新输入");
		}
		if(userName!=null&&userName!=""&&passWord!=null&&passWord!="") {
			//密码加密，加密方法MD5，salt为用户名，加密次数7次
			Integer result =  userService.register(name,userName, passWord);
			if(result==1) {
				return JsonResult.success("注册成功");
			}
		}
		return JsonResult.error("注册异常");
	}
}
