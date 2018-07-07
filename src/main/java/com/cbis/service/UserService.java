package com.cbis.service;

import com.cbis.entity.User;
import com.cbis.entity.UserInfo;

/**
 * user的service类
 * 
 * @author fyh date:2018.06.30-16:08
 */
public interface UserService {

	// 用户注册的方法
	public boolean userRegister(User user);

	// 用户登录的方法
	public User userLogin(User user);

	// 验证用户名是否存在的方法
	public boolean queryUserName(String userName);

	// 更新用户详情表信息
	public boolean updateUserInfo(UserInfo userInfo);

	// 查询对应uerId用户详情表的信息
	public UserInfo queryUserInfoById(int userId);

}
