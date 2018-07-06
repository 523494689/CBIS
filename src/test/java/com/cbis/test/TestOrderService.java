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
	 * ������ӳ˿ͱ�
	 */
	@Test
	public void addPas(){
		Passenger passenger = new Passenger();
		passenger.setUserId(1);
		passenger.setpName("���Գ˿ͱ�");
		passenger.setpIDCard("1111111111111111");
		passenger.setpTelphone("18405049876");
		//����Ϣ���ڳ˿���Ϣ����
		boolean flag = orderService.addPassenger(passenger);
		if (flag) {
			System.out.println("��ӳɹ�");
		}
		
	}
	
	/**
	 * ���Գ˿�����
	 */

	@Test
	public void queryPasName(){
		
		//��ȡ�˿͵���Ϣ
		List<Passenger> pasList = orderService.queryPassengers(1);
		String name[] = {"","","","","","","",""};
		//����list���ճ˿͵�����
		for (int i = 0; i < pasList.size(); i++) {
			System.out.println(pasList.get(i).getpName());			
		}
		
		System.out.println(name.toString());
				
		
		
	}
}
