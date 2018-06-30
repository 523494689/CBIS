package com.cbis.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbis.entity.User;
import com.cbis.service.UserService;

/**
 * 用户的控制器
 * @author Administrator
 *
 */

@Controller
public class UserController {
	
	//实例化用户的service类
	@Resource
	private UserService us;
	
	/**
	 * 用户注册的方法
	 */
	@RequestMapping(value="/register")
    public String userRegister() {
		
		//获取系统的时间
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logDate = df.format(date);
    	//获取用户注册的数据
		User user = new User("admin", "admin2", 1, logDate, "123@qq.com");
		//注册用户
		boolean flag = us.userRegister(user);
		//判断用户是否注册成功以及用户详细信息表是否创建
		if (flag) {
			//注册成功,跳转登录界面
			return "register";
		}
		//创建用户信息详情表
		return null;	  	
    }
	
	/**
	 * 用户登录的方法
	 * @return
	 */
	@RequestMapping(value="/login")
	public String userLogin() {
		
		//获取用户登录的账号密码
		String userName = "";
		String userPassword = "";
		//实例化user
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		//判断账号密码是否正确
		User user2 = us.userLogin(user);
		if (null != user2) {
			//如果登录成功,跳转购买界面
			return "";
		}
		return "";
	}
}
