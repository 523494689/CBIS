package com.cbis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cbis.entity.Schedule;

@Repository(value = "scheduleDao")
public interface ScheduleDao {
	// 查询站点的详细信息
	public Schedule querySchedule(@Param("trainId") Integer trainId, @Param("station") String station);
	//查询对应车次的详细信息
	public List<Schedule> querySchByTrainId(int trainId);
}
