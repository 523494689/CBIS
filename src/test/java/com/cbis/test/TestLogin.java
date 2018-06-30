package com.cbis.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cbis.entity.User;
import com.cbis.service.UserService;

/**
 * �û�ע�������
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
		
		//��ȡ�û���¼���˺�����
		String userName = "admin";
		String userPassword = "admin211";
		//ʵ����user
		User user = new User();
		//�����˺�����
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		User user2 = us.userLogin(user);
		
		if (null != user2) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}
	 

	}

}
