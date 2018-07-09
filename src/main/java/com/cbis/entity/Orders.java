package com.cbis.entity;

public class Orders {
	private int id;

	private String orderNum; // 鍗曞彿
	private int userId; // 涓嬪崟浜篿d
	private String trainNo; // 杞︽id
	private String start; // 鍑哄彂绔欏簭鍙�
	private String stop; // 鍒拌揪绔欏簭鍙�
	private String seatType;
	private int passId; // 涔樺id
	private double price;
	private String oTime; // 涓嬪崟鏃堕棿
	private Integer state; // 璁㈠崟鐘舵��

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getStop() {
		return stop;
	}

	public void setStop(String stop) {
		this.stop = stop;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getoTime() {
		return oTime;
	}

	public void setoTime(String oTime) {
		this.oTime = oTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderNum=" + orderNum + ", userId=" + userId + ", trainNo=" + trainNo
				+ ", start=" + start + ", stop=" + stop + ", seatType=" + seatType + ", passId=" + passId + ", price="
				+ price + ", oTime=" + oTime + ", state=" + state + "]";
	}

	public Orders(String orderNum, int userId, String trainNo, String start, String stop, String seatType, int passId,
			double price, String oTime, Integer state) {
		super();
		this.orderNum = orderNum;
		this.userId = userId;
		this.trainNo = trainNo;
		this.start = start;
		this.stop = stop;
		this.seatType = seatType;
		this.passId = passId;
		this.price = price;
		this.oTime = oTime;
		this.state = state;
	}

}
