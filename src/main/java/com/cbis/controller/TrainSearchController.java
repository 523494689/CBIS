package com.cbis.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbis.dao.ScheduleDao;
import com.cbis.dao.TrainDao;
import com.cbis.entity.Train;

@Controller
@RequestMapping("/search-api")
public class TrainSearchController {
	@Resource(name = "trainDao")
	private TrainDao trainDao;
	@Resource(name = "scheduleDao")
	private ScheduleDao scheduleDao;

	@RequestMapping(value = "/trains", method = RequestMethod.GET)
	@ResponseBody
	public List<Train> search(@RequestParam(name = "start") String startStation,
			@RequestParam(name = "stop") String stopStation) {
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
