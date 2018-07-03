package com.cbis.serviceImpl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbis.dao.ScheduleDao;
import com.cbis.dao.TrainDao;
import com.cbis.entity.Train;
import com.cbis.service.TrainSearchService;

@Service("trainSearchService")
public class TrainSearchServiceImpl implements TrainSearchService {
	@Resource(name = "scheduleDao")
	private ScheduleDao scheduleDao;
	@Resource(name = "trainDao")
	private TrainDao trainDao;

	@Override
	public List<Train> getTrains(String startStation, String stopStation) {
		String pattern = startStation + ".*" + stopStation;
		List<Train> trains = trainDao.queryTrains(pattern);

		for (Train train : trains) {
			String start = startStation;
			String stop = stopStation;

			List<String> stationList = Arrays.asList(train.getStations().split("-"));

			// 得到第一个包含start字符串的子项
			for (String string : stationList) {
				if (string.matches(start + ".*?")) {
					start = string;
					break;
				}
			}

			// 得到最后一个包含stop字符串的子项
			for (int i = stationList.size() - 1; i > -1; i--) {
				if (stationList.get(i).matches(stop + ".*?")) {
					stop = stationList.get(i);
					break;
				}
			}

			train.setStart(scheduleDao.querySchedule(train.getTrainId(), start));
			train.setStop(scheduleDao.querySchedule(train.getTrainId(), stop));
		}
		return trains;
	}

}
