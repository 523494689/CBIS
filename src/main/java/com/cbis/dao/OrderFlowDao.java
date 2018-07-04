package com.cbis.dao;

import com.cbis.entity.OrderFlow;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderFlowDao")
public interface OrderFlowDao {
    public boolean insertOrderFlow(OrderFlow orderFlow);

    public List<OrderFlow> selectOrderFlow(@Param("orderNum") String orderNum);
}
