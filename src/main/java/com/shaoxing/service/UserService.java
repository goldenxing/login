package com.shaoxing.service;

import com.shaoxing.pojo.User;

public interface UserService {
	User findUserByName(String userName);
	User showUsers(String uid);
	String findUserIdByName(String userName);
}
