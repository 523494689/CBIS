package com.cbis.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbis.entity.User;
import com.cbis.entity.UserInfo;
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

		



	public String userRegister(User user,HttpSession session) {

		// ��ȡϵͳ��ʱ��
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
		// ��ȡ�û�ע�������
		User user2 = new User(user.getUserName(), user.getUserPassword(), 1, logDate, user.getUserEmail());
		System.out.println("֮ǰ");
		
		// ע���û�
		boolean flag = us.userRegister(user2);
		// �ж��û��Ƿ�ע��ɹ��Լ��û���ϸ��Ϣ���Ƿ񴴽�
		System.out.println("֮��");
		
		if (flag) {
			// ע��ɹ�,��ת��¼����
			return "redirect:Front/index.jsp";
		}
		// ע��ʧ��
		return null;
	}

	/**
	 * �û���¼�ķ���/Json
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public boolean userLogin(@RequestBody User user, HttpSession session) {

		// �ж��û��˺������Ƿ���ȷ

		User user2 = us.userLogin(user) ;

		boolean flag = us.userLogin(user) != null;
		
		System.out.println(flag);


		// �����¼�ɹ�,�����ݴ���session����
		if (user2!=null) {
			session.setAttribute("user", user2);
			return true;
		}

		else {
			return false;
		}
	}

	/**
	 * ��֤�û����Ƿ���ڵķ���
	 */
	@RequestMapping(value = "/queryUserName")
	@ResponseBody
	public String queryUserName(HttpServletRequest request,HttpServletResponse response) {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=GBK");
		
		
		String userName=request.getParameter("userName");
		
		boolean flag = us.queryUserName(userName);
		
		if (flag) {
			return "userName is registered";
		}

		return "userName can be registered";
	}
	/**
	 * ��ѯ��ӦuerId�û���������Ϣ
	 */
	@RequestMapping(value = "/queryUserInfo")
	public String queryUserInfoById(HttpSession session,Model model) {
		User u = (User)session.getAttribute("user");
		int userId = u.getUserId();
		UserInfo userInfo = us.queryUserInfoById(userId);
		model.addAttribute("userInfo", userInfo);
		return "mySelf";	
	}
	/**
	 * ��
	 * @param userName
	 * @param userEmail
	 * @param pName
	 * @param userId
	 * @param pIDCard
	 * @param pTelphone
	 * @return
	 */
	@RequestMapping(value = "/updateUserInfo")
	public String updateUserInfo(String userName,String userEmail,String pName,String userId,String pIDCard,String pTelphone ) {
		int userId1 = Integer.parseInt(userId);
		UserInfo userInfo = new UserInfo(userId1, userName, pName, userEmail, pIDCard, pTelphone);
		us.updateUserInfo(userInfo);
		return "index";
	}
}
