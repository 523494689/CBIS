package com.cbis.entity;


/**
 * 后台用户实体类
 * @author fyh
 * 2018年7月7日10:27:18
 */
public class BackUser {
	
	//用户基本信息
	private int userId;
	private String userName;
	private String userPassword;
	private String userRegTime;
	//添加用户详细信息表,
	private String pName;
	private String userEmail;
	private String pIDCard;
	private String pTelphone;
	//添加绑定的乘客表
	private String PasName;
	
	
	public BackUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BackUser(int userId, String userName, String userPassword, String userRegTime, String pName,
			String userEmail, String pIDCard, String pTelphone, String pasName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRegTime = userRegTime;
		this.pName = pName;
		this.userEmail = userEmail;
		this.pIDCard = pIDCard;
		this.pTelphone = pTelphone;
		PasName = pasName;
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


	public String getUserRegTime() {
		return userRegTime;
	}


	public void setUserRegTime(String userRegTime) {
		this.userRegTime = userRegTime;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getpIDCard() {
		return pIDCard;
	}


	public void setpIDCard(String pIDCard) {
		this.pIDCard = pIDCard;
	}


	public String getpTelphone() {
		return pTelphone;
	}


	public void setpTelphone(String pTelphone) {
		this.pTelphone = pTelphone;
	}


	public String getPasName() {
		return PasName;
	}


	public void setPasName(String pasName) {
		PasName = pasName;
	}


	@Override
	public String toString() {
		return "BackUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userRegTime=" + userRegTime + ", pName=" + pName + ", userEmail=" + userEmail + ", pIDCard="
				+ pIDCard + ", pTelphone=" + pTelphone + ", PasName=" + PasName + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
