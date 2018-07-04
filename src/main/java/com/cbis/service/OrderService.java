package com.cbis.service;

import com.cbis.entity.Orders;
import com.cbis.entity.Passenger;

import java.util.List;

public interface OrderService {
    public List<Passenger> queryPassengers(int userId);

    public boolean addPassenger(Passenger passenger);

    public boolean addOrder(Orders order);

    public List<Orders> queryOrders(int userId);
}
