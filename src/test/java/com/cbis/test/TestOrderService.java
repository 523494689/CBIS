package com.cbis.test;

import com.cbis.entity.Passenger;
import com.cbis.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

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
}
