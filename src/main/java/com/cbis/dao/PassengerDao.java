package com.cbis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cbis.entity.Passenger;

/**
 * �û��˿ͱ��dao
 * 2018��7��5��10:24:28
 * 
 * @author Administrator
 *
 */
@Repository("passengerDao")
public interface PassengerDao {
	
	/**
	 * ��ӳ˿���Ϣ��
	 * @param passenger
	 * @return
	 */
    public boolean insertPassenger(Passenger passenger);
    
    /**
     * ��ѯ�˿ͱ�
     * @param userId
     * @return
     */
    public List<Passenger> selectPassengers(@Param("userId") int userId);
    

}
