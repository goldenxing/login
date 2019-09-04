package com.shaoxing.mapper;


/**
 * @author Nicolas.
 * @version 1.0
 * @since 1.0
 */

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.shaoxing.entity.SysPermission;


@Repository
public interface SysPermissionMapper{
	/**
	 * 新增
	 * @param entity
	 */
	void insert(SysPermission entity);
	/**
	 * 修改
	 * @param entity
	 */
	void update(SysPermission entity);
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
	SysPermission getById(java.lang.Integer id);
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
	List<SysPermission> findPage(Map<String, Object> param);
	/**
	 * 根据条件查询所有数量分页对象
	 * @param param
	 * @param pageBounds
	 * @return
	 */
	//PageList<SysPermission> findPage(Map<String, Object> param, PageBounds pageBounds);
	List<Integer> findPermissionIdByRoleId(Integer roleId);
}
