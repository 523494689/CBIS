package com.cbis.test;

import com.cbis.entity.SearchInfo;
import com.cbis.entity.Train;
import com.cbis.service.TrainSearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-spring.xml" })
public class TestTrainSearchService {
    @Resource(name = "trainSearchService")
    private TrainSearchService trainSearchService;

    @Test
    public void search(){
        SearchInfo searchInfo = new SearchInfo();
        searchInfo.setStart("œ√√≈");
        searchInfo.setStop("∫º÷›");

        List<Train> list = trainSearchService.getTrains(searchInfo);

        list.forEach(System.out::println);

        System.out.println(list.size());
    }
}
