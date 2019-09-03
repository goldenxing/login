package com.shaoxing.mapper;


/**
 * @author Nicolas.
 * @version 1.0
 * @since 1.0
 */

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.shaoxing.entity.User;



@Repository
public interface UserMapper{
	/**
	 * 新增
	 * @param entity
	 */
	void insert(User entity);
	/**
	 * 修改
	 * @param entity
	 */
	void update(User entity);
	/**
	 * 删除
	 * @param entity
	 */
	void delete(java.lang.String id);
	/**
	 * 根据Id查询对象
	 * @param id
	 * @return
	 */
	User getById(java.lang.String id);
	/**
	 * 查询所有数量计数
	 * @param param
	 * @return
	 */
	Long count();
	/**
	 * 根据条件查询所有数量集合
	 * @param param
	 * @return
	 */
	List<User> findPage(Map<String, Object> param);
	/**
	 * 根据条件查询所有数量分页对象
	 * @param param
	 * @param pageBounds
	 * @return
	 */
	//PageList<User> findPage(Map<String, Object> param, PageBounds pageBounds);
	/** 
	 * .根据用户名查询用户信息. <br/>  
	 * @date: 2019年8月31日 上午10:06:27.<br/>
	 * @author 金光闪闪钻石醒
	 * @return 
	 * @since JDK 1.8
	 */
	User findUserByName(String userName);
	/** 
	 * .注册. <br/> 
	 * @date: 2019年9月2日 上午10:21:43.<br/>
	 * @author 金光闪闪钻石醒 
	 * @param userName
	 * @param md5Password
	 * @return 
	 * @since JDK 1.8
	 */
	Integer register(@Param("name")String name,@Param("userName")String userName,@Param("md5PassWord")String md5PassWord,@Param("state")Integer state);
}
