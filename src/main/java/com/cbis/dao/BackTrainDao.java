package com.cbis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cbis.entity.BackPas;
import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;
import com.cbis.entity.BackUser;
import com.cbis.entity.Orders;

/**
 * 后台管理的dao
 * @author fyh
 * 2018年7月6日14:01:47
 */
@Repository
public interface BackTrainDao {
	
	//显示后台车次信息表的信息
	public List<BackTrain> showTrain();
	
	//显示后台车站路线信息表的信息
	public List<BackStation> showStation();
	
	//显示后台用户的信息
	public List<BackUser> showUser();
	
	//显示后台绑定乘客表的方法
	public List<BackPas> showPas(int userId);
	
	/**
	 * 查询所有订单
	 * @param userId
	 * @return
	 */
	public List<Orders> selectAllOrders();

}
