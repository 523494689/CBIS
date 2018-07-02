package com.cbis.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbis.entity.User;
import com.cbis.service.UserService;

/**
 * �û��Ŀ�����
 * 
 * @author fyh date:2018.06.30-16:08
 */

@Controller
public class UserController {

	// ʵ�����û���service��
	@Resource
	private UserService us;

	/**
	 * �û�ע��ķ���
	 */
	@RequestMapping(value = "/register")
	public String userRegister() {

		// ��ȡϵͳ��ʱ��
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
		// ��ȡ�û�ע�������
		User user = new User("admin", "admin2", 1, logDate, "123@qq.com");
		// ע���û�
		boolean flag = us.userRegister(user);
		// �ж��û��Ƿ�ע��ɹ��Լ��û���ϸ��Ϣ���Ƿ񴴽�
		if (flag) {
			// ע��ɹ�,��ת��¼����
			return "register";
		}
		// �����û���Ϣ�����
		return null;
	}

	/**
	 * �û���¼�ķ���
	 * 
	 * @return
	 */
	/*
	 * @RequestMapping(value="/login",method=RequestMethod.POST)
	 * 
	 * @ResponseBody public String userLogin(String userName,String userPassword) {
	 * 
	 * //��ȡ�û���¼���˺����� String userName = request.getParameter("userName"); String
	 * userPassword = request.getParameter("userPassword"); System.out.println("1");
	 * System.out.println("userName"+userName+",userPassword"+userPassword);
	 * //ʵ����user User user = new User(); user.setUserName(userName);
	 * user.setUserPassword(userPassword); //�ж��˺������Ƿ���ȷ User user2 =
	 * us.userLogin(user); if (null != user2) { //�����¼�ɹ�,��ת������� return "info"; }
	 * return "mySelf"; }
	 */

	/**
	 * �û���¼�ķ���/Json
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public boolean userLogin(@RequestBody User user,HttpSession session) {
		
		//�ж��û��˺������Ƿ���ȷ
		boolean flag = us.userLogin(user)!=null;
		
		System.out.println(flag);
		System.out.println(user.getUserName()+","+user.getUserPassword());
		
		//�����¼�ɹ�,�����ݴ���session����
		if (flag) {
			session.setAttribute("user", user);
		}
		
		return flag;

	}

}
