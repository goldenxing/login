package com.shaoxing.entity;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * Date: 2019年8月29日 下午2:45:43 <br/>
 * 
 * @author 金光闪闪钻石醒
 * @version
 * @since JDK 1.8
 */
public class User implements Serializable {

	/**
	 * serialVersionUID:TODO 变量描述.
	 * 
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = -5929196528445097254L;
	private String uid;
	// 账号
	private String userName;
	// 昵称
	private String name;
	// 密码
	private String passWord;
	// 盐（注入灵魂）
	private String salt;
	// 用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
	private String state;
	// 角色列表
	private List<SysUserRole> roleIdList;

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the roleIdList
	 */
	public List<SysUserRole> getRoleIdList() {
		return roleIdList;
	}

	/**
	 * @param roleIdList the roleIdList to set
	 */
	public void setRoleIdList(List<SysUserRole> roleIdList) {
		this.roleIdList = roleIdList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", name=" + name + ", passWord=" + passWord + ", salt="
				+ salt + ", state=" + state + ", roleIdList=" + roleIdList + "]";
	}

}