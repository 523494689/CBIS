package com.cbis.entity;

/**
 * 用户详情信息表实体类
 * @author Administrator
 * 2018.06.30-14:23
 */
public class UserInfo {

	private int userId;
	private String userName;
	private String pName;
	private String pIDCard;
	private String pTelphone;
	
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserInfo(int userId, String userName, String pName, String pIDCard, String pTelphone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pName = pName;
		this.pIDCard = pIDCard;
		this.pTelphone = pTelphone;
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


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
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


	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", pName=" + pName + ", pIDCard=" + pIDCard
				+ ", pTelphone=" + pTelphone + "]";
	}
	
	

}
