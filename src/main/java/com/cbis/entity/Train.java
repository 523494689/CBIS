package com.cbis.entity;

public class Train {
	private int id;
	private int trainId;
	private String trainNo;
	private String stations;
	private int size;
	private Schedule start;
	private Schedule stop;

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

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
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

	public Schedule getStart() {
		return start;
	}

	public void setStart(Schedule start) {
		this.start = start;
	}

	public Schedule getStop() {
		return stop;
	}

	public void setStop(Schedule stop) {
		this.stop = stop;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", trainId=" + trainId + ", trainNo=" + trainNo + ", stations=" + stations
				+ ", size=" + size + ", start=" + start + ", stop=" + stop + "]";
	}

}
