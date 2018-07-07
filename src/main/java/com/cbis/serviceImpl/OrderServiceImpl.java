package com.cbis.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbis.dao.OrderFlowDao;
import com.cbis.dao.OrdersDao;
import com.cbis.dao.PassengerDao;
import com.cbis.entity.OrderFlow;
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
     * ��ѯ�˿���Ϣ��
     */
    @Override
    public List<Passenger> queryPassengers(int userId) {
        return passengerDao.selectPassengers(userId);
    }
    
    /**
     * ��ӳ˿���Ϣ��
     */
    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengerDao.insertPassenger(passenger);
    }

    /**
     * �޸ĳ˿ͱ����Ϣ
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
    
    /**
     * ���ݶ�����Ų�ѯ������Ϣ
     */
	@Override
	public Orders getOrdersByOrderNum(int orderNum) {
		// TODO Auto-generated method stub
		return ordersDao.selectOrdersByOrderNum(orderNum);
	}
	/**
	 * ����ɹ����޸Ķ���״̬
	 */
	@Override
	public boolean updateOrderByOrderNum(String orderNum) {
		// TODO Auto-generated method stub
		return ordersDao.updateOrderByOrderNum(orderNum);
	}

	@Override
	public boolean addOrderFlow(OrderFlow orderFlow) {
		// TODO Auto-generated method stub
		return orderFlowDao.insertOrderFlow(orderFlow);
	}

	
}
