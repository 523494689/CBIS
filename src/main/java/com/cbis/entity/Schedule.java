package com.cbis.entity;

public class Schedule {
	private int id;
	private int trainId;
	private int stationNo;
	private String station;
	private String arrive;
	private String start;
	private int stopover;

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

	public int getStationNo() {
		return stationNo;
	}

	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getArrive() {
		return arrive;
	}

	public void setArrive(String arrive) {
		this.arrive = arrive;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public int getStopover() {
		return stopover;
	}

	public void setStopover(int stopover) {
		this.stopover = stopover;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", trainId=" + trainId + ", stationNo=" + stationNo + ", station=" + station
				+ ", arrive=" + arrive + ", start=" + start + ", stopover=" + stopover + "]";
	}

}
