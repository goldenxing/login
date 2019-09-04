package com.shaoxing.service;

import java.util.List;

import com.shaoxing.entity.SysRole;

public interface RoleService {
	SysRole findRoleByRoleId(Integer roleId);
	List<Integer> findPermissionIdByRoleId(Integer roleId);
}
