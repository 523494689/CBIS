package com.cbis.test;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cbis.dao.ScheduleDao;
import com.cbis.dao.TrainDao;
import com.cbis.entity.Train;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-spring.xml" })
public class TestTrainSearch {
	@Resource(name = "trainDao")
	private TrainDao trainDao;
	@Resource(name = "scheduleDao")
	private ScheduleDao scheduleDao;

	@Test
	public void show() {
		String s1 = "厦门";
		String s2 = "杭州";
		String pattern = "厦门.*杭州";
		List<Train> list = trainDao.queryTrains(pattern);

		for (Train train : list) {
			String start = s1;
			String stop = s2;

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

			System.out.println(train);
		}

		// list.forEach(System.out::println);
	}
}
