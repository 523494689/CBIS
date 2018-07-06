package com.cbis.entity;

/**
 * 后台显示车站路线实体类
 * @author fyh
 * 2018年7月6日15:44:07
 */
public class BackStation {
	
	private int id;
	private int trainId;
	private String stations;
	private int size;
	private String trainNo;
	
	public BackStation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BackStation(int id, int trainId, String stations, int size, String trainNo) {
		super();
		this.id = id;
		this.trainId = trainId;
		this.stations = stations;
		this.size = size;
		this.trainNo = trainNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getStations() {
		return stations;
	}

	public void setStations(String stations) {
		this.stations = stations;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	@Override
	public String toString() {
		return "BackStation [id=" + id + ", trainId=" + trainId + ", stations=" + stations + ", size=" + size
				+ ", trainNo=" + trainNo + "]";
	}
	
	
	
	
	

}
