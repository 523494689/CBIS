package com.cbis.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cbis.dao.UserDao;
import com.cbis.entity.User;
import com.cbis.entity.UserInfo;
import com.cbis.service.UserService;

/**
 * user的service实现类
 * @author fyh
 * date:2018.06.30-16:08
 */
@Service(value="userService")
public class UserServiceImpl implements UserService{
	//实例化userDao
	@Resource
	private UserDao ud;
    
	/**
	 * 用户注册的方法
	 */
	@Override
	//事务的隔离级别的设置和传播特性的设置
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public boolean  userRegister(User user) {
		// TODO Auto-generated method stub
		
		//判断是否注册成功
		boolean flag = ud.userRegister(user);
		//新建用户详情信息实例
		UserInfo userInfo = new UserInfo();
		//设置userId
		userInfo.setUserId(user.getUserId());
		//设置用户账号
		userInfo.setUserName(user.getUserName());
		//设置用户的邮箱
		userInfo.setUserEmail(user.getUserEmail());

		//绑定用户详情信息表
		boolean flag2 = ud.addUserInfo(userInfo);		
		//使用事务判断是否同时满足
		if (flag2 && flag) {
			return true;
		}
		
		
		return false;
	}
	
	
	/**
	 * 用户登录的方法
	 */
	public User userLogin(User user) {
		
		user = ud.userLogin(user);
				
		return user;
	}
    


	
	
	

}
