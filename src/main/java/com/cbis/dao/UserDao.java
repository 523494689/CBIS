package com.cbis.dao;

import org.springframework.stereotype.Repository;

import com.cbis.entity.User;
import com.cbis.entity.UserInfo;

/**
 * user的dao
 * @author Administrator
 *
 */

@Repository(value="userDao")
public interface UserDao {
	
	//用户注册的方法
	public boolean userRegister(User user);
	
	//用户登录的方法
	public User userLogin(User user);
	
	//用户绑定用户详情信息表
	public boolean addUserInfo(UserInfo userInfo);

}
