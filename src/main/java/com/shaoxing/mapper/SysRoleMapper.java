package com.shaoxing.mapper;


/**
 * @author Nicolas.
 * @version 1.0
 * @since 1.0
 */

import java.util.List;
import java.util.Map;

import com.shaoxing.entity.SysRole;


public interface SysRoleMapper{
	/**
	 * 新增
	 * @param entity
	 */
	void insert(SysRole entity);
	/**
	 * 修改
	 * @param entity
	 */
	void update(SysRole entity);
	/**
	 * 删除
	 * @param entity
	 */
	void delete(java.lang.Integer id);
	/**
	 * 根据Id查询对象
	 * @param id
	 * @return
	 */
	SysRole getById(java.lang.Integer id);
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
	List<SysRole> findPage(Map<String, Object> param);
	/**
	 * 根据条件查询所有数量分页对象
	 * @param param
	 * @param pageBounds
	 * @return
	 */
	//PageList<SysRole> findPage(Map<String, Object> param, PageBounds pageBounds);
}
