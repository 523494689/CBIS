package com.cbis.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cbis.entity.User;
import com.cbis.service.UserService;

/**
 * 用户注册测试类
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-spring.xml" })
public class TestLogin {

	@Resource
	private UserService us;
	@Test
	public void login() {
		
		//获取用户登录的账号密码
		String userName = "admin";
		String userPassword = "admin211";
		//实例化user
		User user = new User();
		//设置账号密码
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		User user2 = us.userLogin(user);
		
		if (null != user2) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	 

	}

}
