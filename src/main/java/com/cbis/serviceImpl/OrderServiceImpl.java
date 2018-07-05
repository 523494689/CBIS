package com.cbis.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbis.dao.OrderFlowDao;
import com.cbis.dao.OrdersDao;
import com.cbis.dao.PassengerDao;
import com.cbis.entity.Orders;
import com.cbis.entity.Passenger;
import com.cbis.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource(name = "passengerDao")
    private PassengerDao passengerDao;
    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;
    @Resource(name = "orderFlowDao")
    private OrderFlowDao orderFlowDao;

    /**
     * 查询乘客信息表
     */
    @Override
    public List<Passenger> queryPassengers(int userId) {
        return passengerDao.selectPassengers(userId);
    }
    
    /**
     * 添加乘客信息表
     */
    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengerDao.insertPassenger(passenger);
    }

    /**
     * 修改乘客表的信息
     */
    @Override
	public boolean updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return passengerDao.updatePassengers(passenger);
	}
    
    
    @Override
    public boolean addOrder(Orders order) {
        return ordersDao.insertOrder(order);
    }

    @Override
    public List<Orders> queryOrders(int userId) {
        return ordersDao.selectOrders(userId);
    }

	
}
