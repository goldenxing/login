package com.shaoxing.service.impl;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaoxing.entity.User;
import com.shaoxing.mapper.UserMapper;
import com.shaoxing.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUserByName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findUserByName(userName);
	}

	@Override
	public User showUsers(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findUserIdByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer register(String name,String userName, String passWord) {
		// TODO Auto-generated method stub
		String md5PassWord = new SimpleHash("MD5",passWord,userName,7).toHex();
		Integer state = 0;
		return userMapper.register(name,userName,md5PassWord,state);
	}

}
