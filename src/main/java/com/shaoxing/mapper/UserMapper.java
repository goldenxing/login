package com.shaoxing.mapper;


/**
 * @author Nicolas.
 * @version 1.0
 * @since 1.0
 */

import java.util.List;
import java.util.Map;

import com.shaoxing.entity.User;


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
}
