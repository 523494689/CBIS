package com.cbis.dao;

import org.springframework.stereotype.Repository;

import com.cbis.entity.User;
import com.cbis.entity.UserInfo;

/**
 * user的dao
 * @author fyh
 * date:2018.06.30-16:08
 */

@Repository(value="userDao")
public interface UserDao {
	
	//用户注册的方法
	public boolean userRegister(User user);
	
	//用户登录的方法
	public User userLogin(User user);
	
	//用户绑定用户详情信息表
	public boolean addUserInfo(UserInfo userInfo);
	
	//验证用户名是否已存在
	public User queryUserName(String userName);
	
	//更新用户详情表信息
	public boolean updateUserInfo(UserInfo userInfo);
	
	//查询对应uerId用户详情表的信息
	public UserInfo queryUserInfoById(int userId);
	
}
