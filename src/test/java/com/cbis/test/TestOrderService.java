package com.cbis.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cbis.entity.Passenger;
import com.cbis.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:mybatis-spring.xml" })
public class TestOrderService {
	@Resource(name = "orderService")
	private OrderService orderService;

	@Test
	public void add() {
		Passenger passenger = new Passenger();
		passenger.setpName("leng");
		passenger.setUserId(3333);
		passenger.setpIDCard("123466987");

		boolean flag = orderService.addPassenger(passenger);
		System.out.println(flag);
	}

	@Test
	public void show(){
		List<Passenger> list = orderService.queryPassengers(3333);
		list.forEach(System.out::println);
	}
	
	/**
	 * 测试添加乘客表
	 */
	@Test
	public void addPas(){
		Passenger passenger = new Passenger();
		passenger.setUserId(1);
		passenger.setpName("测试乘客表");
		passenger.setpIDCard("1111111111111111");
		passenger.setpTelphone("18405049876");
		//把信息存在乘客信息表中
		boolean flag = orderService.addPassenger(passenger);
		if (flag) {
			System.out.println("添加成功");
		}
		
	}
}
