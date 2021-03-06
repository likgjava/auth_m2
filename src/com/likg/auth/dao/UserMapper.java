package com.likg.auth.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.likg.auth.domain.User;

@Repository
public interface UserMapper {
	
	public User getUser(int id);

	public List<User> getUserList();
	
	public void saveUser(User user);
	public void saveUserRole(User user);
	
	public void updateUser(User user);

	public void deleteUser(int id);

	public List<User> getPage(User user, RowBounds rowBounds);

	public Integer getCount(User User);

	public void deleteUserRole(int id);


	
	
}
