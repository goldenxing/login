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
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUserName(userName);
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
		String md5PassWord = MD5Hash(userName,passWord);
		Integer state = 0;
		return userMapper.register(name,userName,md5PassWord,state);
	}
	
	/** 
	 * .密码MD5散列(默认salt为userName). <br/> 
	 * @date: 2019年9月3日 下午3:13:48.<br/>
	 * @author 金光闪闪钻石醒 
	 * @param userName
	 * @param passWord
	 * @return 
	 * @since JDK 1.8
	 */
	@Override
	public String MD5Hash(String userName,String passWord) {
		String NewPassWord = new SimpleHash("MD5",passWord,userName,7).toString();
		return NewPassWord;
	}

	/** 
	 * .根据用户名查密码. <br/> 
	 * @date: 2019年9月3日 下午4:51:04.<br/>
	 * @author 金光闪闪钻石醒 
	 * @param userName
	 * @return 
	 * @since JDK 1.8
	 */
	@Override
	public String findpassWordByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findpassWordByUserName(userName);
	}

}
