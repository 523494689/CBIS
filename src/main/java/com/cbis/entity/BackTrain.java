package com.cbis.entity;

public class BackTrain {
	
	/**
	 * 后台管理的车次信息实体类
	 * fyh
	 * 2018年7月6日13:58:18
	 */
	private int trainId;
	private String trainType;
	private String trainNo;
	private String startStation;
	private String stopStation;
	private String trainCode;
	
	public BackTrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BackTrain(int trainId, String trainType, String trainNo, String startStation, String stopStation) {
		super();
		this.trainId = trainId;
		this.trainType = trainType;
		this.trainNo = trainNo;
		this.startStation = startStation;
		this.stopStation = stopStation;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getStopStation() {
		return stopStation;
	}

	public void setStopStation(String stopStation) {
		this.stopStation = stopStation;
	}

	public String getTrainCode() {
		return trainCode;
	}

	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}

	@Override
	public String toString() {
		return "BackTrain [trainId=" + trainId + ", trainType=" + trainType + ", trainNo=" + trainNo + ", startStation="
				+ startStation + ", stopStation=" + stopStation + ", trainCode=" + trainCode + "]";
	}
	
	

	
	

}
