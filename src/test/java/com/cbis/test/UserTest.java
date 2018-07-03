package com.cbis.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cbis.entity.User;
import com.cbis.service.UserService;

/**
 * 用户测试类
 * @author fyh
 * date:2018.06.30-16:08
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-spring.xml" })
public class UserTest {

	@Resource
	private UserService us;
	@Test
	/**
	 * 用户登录测试
	 */
	public void login() {
		
		//获取用户登录的账号密码
		String userName = "admin";
		String userPassword = "admin2";
		//实例化user
		User user = new User();
		//设置账号密码
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		User user2 = us.userLogin(user);
		
		System.out.println(user2);
		
		if (null != user2) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	 

	}
	/**
	 * 用户注册测试
	 */
	@Test
	public void register() {

		// 系统的时间
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
		//获取用户注册的信息
		User user = new User("admin2000", "admin7", 1, logDate, "123@qq.com");
        //判断用户注册是否成功
		boolean flag = us.userRegister(user);
		System.out.println(flag);
		if (flag) {
			System.out.println("两张表都成功了");
		}
		 

	}


}
