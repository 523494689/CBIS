package com.cbis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;

/**
 * 后台管理的dao
 * @author fyh
 * 2018年7月6日14:01:47
 */
@Repository
public interface BackTrainDao {
	
	//显示车次信息表的信息
	public List<BackTrain> showTrain();
	
	//显示车站路线信息表的信息
	public List<BackStation> showStation();

}
