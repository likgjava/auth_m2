package com.likg.auth.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.likg.auth.dao.RoleMapper;
import com.likg.auth.domain.Page;
import com.likg.auth.domain.Role;

@Service
public class RoleService {
	
	@Resource
	private RoleMapper roleMapper;

	public Role getRole(int id) throws Exception {
		return roleMapper.getRole(id);
	}
	
	public List<Role> getRoleList() throws Exception {
		return roleMapper.getRoleList();
	}

	public void saveRole(Role role) throws Exception {
		// 新增
		if (role.getId() == 0) {
			roleMapper.saveRole(role);
		}
		// 修改
		else {
			roleMapper.updateRole(role);
		}
	}

	@Transactional
	public void delete(int id) throws Exception {
		//删除用户角色信息
		roleMapper.deleteUserRole(id);
		//删除角色信息
		roleMapper.deleteRole(id);
	}

	public Page<Role> getPage(Page<Role> rolePage, Role role) throws Exception {
		Integer totalCount = roleMapper.getCount(role);
		rolePage.setTotal(totalCount);
		if(totalCount > 0) {
			RowBounds rowBounds = new RowBounds(rolePage.getIndex(), rolePage.getPageSize());
			List<Role> roleList = roleMapper.getPage(role, rowBounds);
			rolePage.setRows(roleList);
		}
		return rolePage;
	}

	public List<Role> getRoleListByUser(int userId) {
		return roleMapper.getRoleListByUser(userId);
	}
	
	

}
