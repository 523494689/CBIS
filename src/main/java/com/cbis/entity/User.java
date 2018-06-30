package com.cbis.entity;


/**
 * 用户注册的实体类
 * @author Administrator
 *
 */
public class User {
	
	private int userId;
	private String userName;
	private String userPassword;
	private int userType;
	private String userRegTime;
	private String userEmail;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int userId, String userName, String userPassword, int userType, String userRegTime, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
		this.userRegTime = userRegTime;
		this.userEmail = userEmail;
	}
	
	public User( String userName, String userPassword, int userType, String userRegTime, String userEmail) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
		this.userRegTime = userRegTime;
		this.userEmail = userEmail;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public int getUserType() {
		return userType;
	}


	public void setUserType(int userType) {
		this.userType = userType;
	}


	public String getUserRegTime() {
		return userRegTime;
	}


	public void setUserRegTime(String userRegTime) {
		this.userRegTime = userRegTime;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userType="
				+ userType + ", userRegTime=" + userRegTime + ", userEmail=" + userEmail + "]";
	}
	
	
	

}