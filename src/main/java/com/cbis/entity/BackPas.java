package com.cbis.entity;

/**
 * ��̨�����û��󶨳˿͵�ʵ����
 * @author fyh
 * 2018��7��7��15:43:37
 */
public class BackPas {
	
	private int id;
	private String pName;
	private String pIDCard;
	
	public BackPas(int id, String pName, String pIDCard) {
		super();
		this.id = id;
		this.pName = pName;
		this.pIDCard = pIDCard;
	}

	public BackPas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "BackPas [id=" + id + ", pName=" + pName + ", pIDCard=" + pIDCard + "]";
	}
	
	

}
