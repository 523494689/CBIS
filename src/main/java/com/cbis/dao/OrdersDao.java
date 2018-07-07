package com.cbis.dao;

import com.cbis.entity.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ordersDao")
public interface OrdersDao {
    public List<Orders> selectOrders(@Param("userId") int userId);

    public boolean insertOrder(Orders order);

    public boolean updateOrder(Orders order);
   
    
    /**
     * 根据订单编号查询订单
     * @param orderNum
     * @return
     */
    public Orders selectOrdersByOrderNum(int orderNum);
    /**
     * 付款成功后根据订单编号修改订单状态
     * @param orderNum
     * @return
     */
    public boolean updateOrderByOrderNum(String orderNum);
}
