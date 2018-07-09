package com.cbis.service;

import java.util.List;

import com.cbis.entity.Orders;
import com.cbis.entity.Passenger;

public interface OrderService {
	public List<Passenger> queryPassengers(int userId);

	public boolean addPassenger(Passenger passenger);

	public boolean addOrder(Orders order);

	public List<Orders> queryOrders(int userId);

	// 修改乘客表的信息
	public boolean updatePassenger(Passenger passenger);

	// 退票(根据订单ID修改state值)
	public boolean updateOrderState(int id);
}
