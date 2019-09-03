package com.shaoxing.service;

import com.shaoxing.entity.User;

public interface UserService {
	User findUserByUserName(String userName);
	User showUsers(String uid);
	String findUserIdByName(String userName);
	Integer register(String name,String userName,String md5PassWord);
	String MD5Hash(String userName, String passWord);
	String findpassWordByUserName(String userName);
}
