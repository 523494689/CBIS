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
 * 用户的控制器
 * 
 * @author fyh date:2018.06.30-16:08
 */

@Controller
public class UserController {

	// 实例化用户的service类
	@Resource
	private UserService us;
	
	/**
	 * 首页
	 */
	@RequestMapping(value = "/index")
	public String index(User user) {

		
		return "index";
	}

	/**
	 * 用户注册的方法
	 */
	@RequestMapping(value = "/register")
	public String userRegister(User user) {

		// 获取系统的时间
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
		// 获取用户注册的数据
		User user2 = new User(user.getUserName(), user.getUserPassword(), 1, logDate, user.getUserEmail());
		// 注册用户
		boolean flag = us.userRegister(user2);
		// 判断用户是否注册成功以及用户详细信息表是否创建
		if (flag) {
			// 注册成功,跳转登录界面
			return "index";
		}
		// 注册失败
		return null;
	}


	/**
	 * 用户登录的方法/Json
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public boolean userLogin(@RequestBody User user,HttpSession session) {
		
		//判断用户账号密码是否正确
		boolean flag = us.userLogin(user)!=null;
		
		//如果登录成功,把数据存在session里面
		if (flag) {
			session.setAttribute("user", user);
		}
		
		return flag;

	}

}
