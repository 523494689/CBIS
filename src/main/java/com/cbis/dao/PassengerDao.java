package com.cbis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cbis.entity.Passenger;

/**
 * 用户乘客表的dao
 * 2018年7月5日10:24:28
 * 
 * @author Administrator
 *
 */
@Repository("passengerDao")
public interface PassengerDao {
	
	/**
	 * 添加乘客信息表
	 * @param passenger
	 * @return
	 */
    public boolean insertPassenger(Passenger passenger);
    
    /**
     * 查询乘客表
     * @param userId
     * @return
     */
    public List<Passenger> selectPassengers(@Param("userId") int userId);
    

}
