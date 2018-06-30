package com.cbis.service;

import com.cbis.entity.User;

/**
 * user的service类
 * @author Administrator
 *
 */
public interface UserService {
	
	//用户注册的方法
	public boolean userRegister(User user);
	
	//用户登录的方法
	public User userLogin(User user);
	
	

}
