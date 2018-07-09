package com.cbis.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbis.dao.BackTrainDao;
import com.cbis.entity.BackPas;
import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;
import com.cbis.entity.BackUser;
import com.cbis.service.BackTrainService;

/**
 * 后台车次信息显示的serviceImpl类
 * @author fyh	
 * 2018年7月6日14:12:33
 */
@Service
public class BackTrainServiceImpl implements BackTrainService{
	
	//实例化dao
	@Resource
	private BackTrainDao backTrainDao;	
    
	/**
	 * 后台显示车次信息的方法
	 */
	@Override
	public List<BackTrain> showTrain() {
		// TODO Auto-generated method stub
		
		List<BackTrain> list = backTrainDao.showTrain();
		
		return list;
	}
    
	/**
	 * 后台显示车站信息表
	 */
	@Override
	public List<BackStation> showStation() {
		
		// TODO Auto-generated method stub
        List<BackStation> list = backTrainDao.showStation();
		
		return list;
	}
    
	/**
	 * 后台显示所有用户的信息
	 */
	@Override
	public List<BackUser> showUser() {
		// TODO Auto-generated method stub
		List<BackUser> list = backTrainDao.showUser();
		return list;
	}
    
	/**
	 * 后台显示用户绑定的所有乘客表
	 */
	@Override
	public List<BackPas> showPas(int userId) {
		// TODO Auto-generated method stub
		List<BackPas> list = backTrainDao.showPas(userId);
		return list;
	}
	
	

}
