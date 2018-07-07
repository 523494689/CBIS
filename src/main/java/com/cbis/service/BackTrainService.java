package com.cbis.service;

import java.util.List;

import com.cbis.entity.BackPas;
import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;
import com.cbis.entity.BackUser;

/**
 * 后台车次信息的service类
 * @author fyh
 * 2018年7月6日14:07:08
 */
public interface BackTrainService {
	
	//后台显示所有的车次信息表
	public List<BackTrain> showTrain();
	
	//后台显示所有的 车站信息表
	public List<BackStation> showStation();
	
	//后台显示所有的用户信息表
	public List<BackUser> showUser();
	
	//后天显示用户绑定的所有乘客表
	public List<BackPas> showPas(int userId);

}
