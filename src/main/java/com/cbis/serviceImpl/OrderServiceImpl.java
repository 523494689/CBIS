package com.cbis.serviceImpl;

import com.cbis.dao.OrderFlowDao;
import com.cbis.dao.OrdersDao;
import com.cbis.dao.PassengerDao;
import com.cbis.entity.Orders;
import com.cbis.entity.Passenger;
import com.cbis.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource(name = "passengerDao")
    private PassengerDao passengerDao;
    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;
    @Resource(name = "orderFlowDao")
    private OrderFlowDao orderFlowDao;


    @Override
    public List<Passenger> queryPassengers(int userId) {
        return passengerDao.selectPassengers(userId);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengerDao.insertPassenger(passenger);
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
