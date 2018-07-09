package com.cbis.dao;

import com.cbis.entity.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ordersDao")
public interface OrdersDao {
	
    public List<Orders> selectOrders(@Param("userId") int userId);
    
    //退票(根据订单ID修改state值)
    public boolean updateOrderState(int id);

    public boolean insertOrder(Orders order);

    public boolean updateOrder(Orders order);
}
