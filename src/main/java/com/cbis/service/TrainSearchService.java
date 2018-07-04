package com.cbis.service;

import java.util.List;

import com.cbis.entity.Schedule;
import com.cbis.entity.Train;

public interface TrainSearchService {
	// ��������ĳ���������վ��ȡ���������ĳ�����Ϣ
	public List<Train> getTrains(String start, String stop);

	// ��ѯ��Ӧ���ε���ϸ��Ϣ
	public List<Schedule> querySchByTrainId(int trainId);
}
