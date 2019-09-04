package com.shaoxing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shaoxing.entity.SysRole;
import com.shaoxing.mapper.SysPermissionMapper;
import com.shaoxing.mapper.SysRoleMapper;
import com.shaoxing.service.RoleService;

public class RoleServiceImpl implements RoleService{
	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Autowired
	private SysPermissionMapper sysPermissionMapper;
	@Override
	public SysRole findRoleByRoleId(Integer roleId) {	
		return sysRoleMapper.findRoleByRoleId(roleId);
	}
	@Override
	public List<Integer> findPermissionIdByRoleId(Integer roleId) {
		// TODO Auto-generated method stub
		return sysPermissionMapper.findPermissionIdByRoleId(roleId);
	}

}
