package com.cbis.dao;

import com.cbis.entity.Passenger;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("passengerDao")
public interface PassengerDao {
    public boolean insertPassenger(Passenger passenger);

    public List<Passenger> selectPassengers(@Param("userId") int userId);
}
