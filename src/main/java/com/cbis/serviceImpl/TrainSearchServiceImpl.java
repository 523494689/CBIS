package com.cbis.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbis.dao.ScheduleDao;
import com.cbis.dao.TrainDao;
import com.cbis.entity.Schedule;
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
		String sqlPattern = startStation + ".*" + stopStation;
		List<Train> trains = trainDao.queryTrains(sqlPattern);

		String str = String.format("(%s.*%s.*?\\b)", startStation, stopStation);
		Pattern pat = Pattern.compile(str);

		for (Train train : trains) {
			Matcher matcher = pat.matcher(train.getStations());
			if (matcher.find()) {
				String[] stations = matcher.group(0).split("-");
				train.setStart(scheduleDao.querySchedule(train.getTrainId(), stations[0]));
				train.setStop(scheduleDao.querySchedule(train.getTrainId(), stations[stations.length-1]));
			}
		}
		return trains;
	}

	@Override
	public List<Schedule> querySchByTrainId(int trainId) {
		// TODO Auto-generated method stub
		return scheduleDao.querySchByTrainId(trainId);
	}

}
