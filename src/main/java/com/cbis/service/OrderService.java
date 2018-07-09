package com.cbis.service;

import java.util.List;

import com.cbis.entity.Orders;
import com.cbis.entity.Passenger;

public interface OrderService {
	public List<Passenger> queryPassengers(int userId);

	public boolean addPassenger(Passenger passenger);

	public boolean addOrder(Orders order);

	public List<Orders> queryOrders(int userId);

	// �޸ĳ˿ͱ����Ϣ
	public boolean updatePassenger(Passenger passenger);

	// ��Ʊ(���ݶ���ID�޸�stateֵ)
	public boolean updateOrderState(int id);
}
