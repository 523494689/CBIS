package com.cbis.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbis.entity.User;
import com.cbis.service.UserService;

/**
 * �û��Ŀ�����
 * @author Administrator
 *
 */

@Controller
public class UserController {
	
	//ʵ�����û���service��
	@Resource
	private UserService us;
	
	/**
	 * �û�ע��ķ���
	 */
	@RequestMapping(value="/register")
    public String userRegister() {
		
		//��ȡϵͳ��ʱ��
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
    	//��ȡ�û�ע�������
		User user = new User("admin", "admin2", 1, logDate, "123@qq.com");
		//ע���û�
		boolean flag = us.userRegister(user);
		//�ж��û��Ƿ�ע��ɹ��Լ��û���ϸ��Ϣ���Ƿ񴴽�
		if (flag) {
			//ע��ɹ�,��ת��¼����
			return "register";
		}
		//�����û���Ϣ�����
		return null;	  	
    }
	
	/**
	 * �û���¼�ķ���
	 * @return
	 */
	@RequestMapping(value="/login")
	public String userLogin() {
		
		//��ȡ�û���¼���˺�����
		String userName = "";
		String userPassword = "";
		//ʵ����user
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		//�ж��˺������Ƿ���ȷ
		User user2 = us.userLogin(user);
		if (null != user2) {
			//�����¼�ɹ�,��ת�������
			return "";
		}
		return "";
	}
}
