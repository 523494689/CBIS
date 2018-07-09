package com.cbis.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import com.cbis.entity.SearchInfo;
import org.springframework.stereotype.Service;

import com.cbis.dao.PassengerDao;
import com.cbis.dao.ScheduleDao;
import com.cbis.dao.TrainDao;
import com.cbis.entity.Passenger;
import com.cbis.entity.Schedule;
import com.cbis.entity.Train;
import com.cbis.service.TrainSearchService;

@Service("trainSearchService")
public class TrainSearchServiceImpl implements TrainSearchService {
    @Resource(name = "scheduleDao")
    private ScheduleDao scheduleDao;
    @Resource(name = "trainDao")
    private TrainDao trainDao;
    @Resource(name = "passengerDao")
    private PassengerDao passengerDao;

    @Override
    public List<Train> getTrains(SearchInfo searchInfo) {
        List<Train> trains = null;

        if (searchInfo.compareToday()>0){
            trains = trainDao.queryTrains(searchInfo.getSqlPattern());
        } else if (searchInfo.compareToday() ==0){
            trains = trainDao.queryTodayTrains(searchInfo);
        }
//      List<Train> trains = trainDao.queryTodayTrains(searchInfo);
//		List<Train> trains = trainDao.queryTrains(searchInfo.getSqlPattern());

        Pattern pat = Pattern.compile(searchInfo.getRePattern());

        for (Train train : trains) {
            Matcher matcher = pat.matcher(train.getStations());
            if (matcher.find()) {
                String[] stations = matcher.group(0).split("-");
                train.setStart(scheduleDao.querySchedule(train.getTrainId(), stations[0]));
                train.setStop(scheduleDao.querySchedule(train.getTrainId(), stations[stations.length - 1]));
            }
        }
        return trains;
    }

    @Override
    public List<Train> getTrains(String start, String stop) {
//		List<Train> trains = trainDao.queryTrains(start + ".+" + stop);
//
//        Pattern pat = Pattern.compile(String.format("(%s.*%s.*?\\b)", start, stop));
//
//        for (Train train : trains) {
//            Matcher matcher = pat.matcher(train.getStations());
//            if (matcher.find()) {
//                String[] stations = matcher.group(0).split("-");
//                train.setStart(scheduleDao.querySchedule(train.getTrainId(), stations[0]));
//                train.setStop(scheduleDao.querySchedule(train.getTrainId(), stations[stations.length - 1]));
//            }
//        }
//        return trains;
        return null;
    }

    @Override
    public List<Schedule> querySchByTrainId(int trainId) {
        // TODO Auto-generated method stub
        return scheduleDao.querySchByTrainId(trainId);
    }

    @Override
    public Passenger queryPassengerBypName(String pName) {
        // TODO Auto-generated method stub
        return passengerDao.queryPassengerBypName(pName);
    }

}
