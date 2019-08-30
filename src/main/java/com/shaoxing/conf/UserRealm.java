package com.shaoxing.conf;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm{
	@Autowired
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * 账号认证 <br/> 
	 * @date: 2019年8月29日 下午10:00:37.<br/>
	 * @author 金光闪闪钻石醒
	 
	 * @param token
	 * @return
	 * @throws AuthenticationException 
	 * @since JDK 1.8
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userName = (String) token.getPrincipal();
		String password = 
		return null;
	}

}
