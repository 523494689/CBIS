package com.cbis.dao;

import java.util.List;

import com.cbis.entity.SearchInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cbis.entity.Train;

@Repository(value = "trainDao")
public interface TrainDao {
	public List<Train> queryTrains(@Param("pattern") String staionPattern);

	// ������Ϣ��ѯ����г��β�ѯ -- 2018��7��7��
	public List<Train> queryTodayTrains(SearchInfo searchInfo);
}
