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
 * �û�ע�������
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

		// ϵͳ��ʱ��
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
		//��ȡ�û�ע�����Ϣ
		User user = new User("admin7", "admin7", 1, logDate, "123@qq.com");
        //�ж��û�ע���Ƿ�ɹ�
		boolean flag = us.userRegister(user);
		
		if (flag) {
			System.out.println("���ű��ɹ���");
		}
		 

	}

}
