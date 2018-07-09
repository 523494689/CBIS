package com.cbis.entity;

public class Orders {
	private int id;
	private String orderNum; // 閸楁洖褰 
	private int userId; // 娑撳宕熸禍绡縟
	private String trainNo; // 鏉烇附顐糹d
	private String start; // 閸戝搫褰傜粩娆忕碍閸欙拷
	private String stop; // 閸掓媽鎻粩娆忕碍閸欙拷
	private String seatType;
	private int passId; // 娑旀ê顓筰d
	private double price;
	private String oTime; // 娑撳宕熼弮鍫曟？
	private Integer state; // 鐠併垹宕熼悩鑸碉拷锟 

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
				+ ", start=" + start + ", stop=" + stop + ", seatType=" + seatType + ", passId=" + passId
				+ ", price=" + price + ", oTime=" + oTime + ", state=" + state + "]";
	}

	public Orders(String orderNum, int userId, String trainNo, String start, String stop, String seatType,
			int passId, double price, String oTime, Integer state) {
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