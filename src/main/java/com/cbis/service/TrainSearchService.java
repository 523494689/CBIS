package com.cbis.service;

import java.util.List;

import com.cbis.entity.Train;

public interface TrainSearchService {
	// 根据请求的出发、到达站获取符合条件的车次信息
	public List<Train> getTrains(String start, String stop);
}
