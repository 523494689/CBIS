package com.cbis.service;

import java.util.List;

import com.cbis.entity.OrderFlow;
import com.cbis.entity.Orders;
import com.cbis.entity.Passenger;

public interface OrderService {
    public List<Passenger> queryPassengers(int userId);
  
    public boolean addPassenger(Passenger passenger);

    public boolean addOrder(Orders order);

    public List<Orders> queryOrders(int userId);
    
    //修改乘客表的信息
    public boolean updatePassenger(Passenger passenger);
    //根据订单编号查询订单
    public Orders getOrdersByOrderNum(int orderNum);
    //付款成功后修改订单状态
    public boolean updateOrderByOrderNum(String orderNum);
    //付款成功后生产流水订单
    public boolean addOrderFlow(OrderFlow orderFlow);
}
