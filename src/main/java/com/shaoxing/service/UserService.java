package com.shaoxing.service;

import com.shaoxing.entity.User;

public interface UserService {
	User findUserByName(String userName);
	User showUsers(String uid);
	String findUserIdByName(String userName);
	Integer register(String name,String userName,String md5PassWord);
}
