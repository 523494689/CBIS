package com.cbis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cbis.entity.SearchInfo;
import com.cbis.entity.Train;

@Repository(value = "trainDao")
public interface TrainDao {
	public List<Train> queryTrains(SearchInfo searchInfo);

	// ������Ϣ��ѯ����г��β�ѯ -- 2018��7��7��
	public List<Train> queryTodayTrains(SearchInfo searchInfo);
}
