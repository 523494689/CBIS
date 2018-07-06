package com.cbis.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cbis.entity.BackStation;
import com.cbis.service.BackTrainService;

/**
 * ��̨������
 * @author fyh
 * 2018��7��6��16:39:08
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-spring.xml" })
public class BackTest {

	@Resource
	private BackTrainService backTrainService;
	@Test
	/**
	 * �û���¼����
	 */
	public void station() {
		
         List<BackStation> stationList = backTrainService.showStation();
		
		System.out.println(stationList);
	 

	}
	

}
