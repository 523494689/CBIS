package com.cbis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cbis.entity.SearchInfo;
import com.cbis.entity.Train;

@Repository(value = "trainDao")
public interface TrainDao {
	public List<Train> queryTrains(SearchInfo searchInfo);

	// 根据信息查询类进行车次查询 -- 2018年7月7日
	public List<Train> queryTodayTrains(SearchInfo searchInfo);
}
