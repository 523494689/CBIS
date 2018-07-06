package com.cbis.service;

import java.util.List;

import com.cbis.entity.Passenger;
import com.cbis.entity.Schedule;
import com.cbis.entity.Train;

public interface TrainSearchService {
	// 根据请求的出发、到达站获取符合条件的车次信息
	public List<Train> getTrains(String start, String stop);

	// 查询对应车次的详细信息
	public List<Schedule> querySchByTrainId(int trainId);
	
	 //查询对应姓名的用户详情表信息
  	public Passenger queryPassengerBypName(String pName);
}
