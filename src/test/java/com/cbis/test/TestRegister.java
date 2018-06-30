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
 * 用户注册测试类
 * @author fyh
 * date:2018.06.30-16:08
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-spring.xml" })
public class TestRegister {

	@Resource
	private UserService us;
	@Test
	public void register() {

		// 系统的时间
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
		//获取用户注册的信息
		User user = new User("admin7", "admin7", 1, logDate, "123@qq.com");
        //判断用户注册是否成功
		boolean flag = us.userRegister(user);
		
		if (flag) {
			System.out.println("两张表都成功了");
		}
		 

	}

}
