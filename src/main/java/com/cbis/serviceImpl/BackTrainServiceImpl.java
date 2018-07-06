package com.cbis.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cbis.dao.BackTrainDao;
import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;
import com.cbis.service.BackTrainService;

/**
 * ��̨������Ϣ��ʾ��serviceImpl��
 * @author fyh	
 * 2018��7��6��14:12:33
 */
@Service
public class BackTrainServiceImpl implements BackTrainService{
	
	//ʵ����dao
	@Resource
	private BackTrainDao backTrainDao;	
    
	/**
	 * ��̨��ʾ������Ϣ�ķ���
	 */
	@Override
	public List<BackTrain> showTrain() {
		// TODO Auto-generated method stub
		
		List<BackTrain> list = backTrainDao.showTrain();
		
		return list;
	}
    
	/**
	 * ��̨��ʾ��վ��Ϣ��
	 */
	@Override
	public List<BackStation> showStation() {
		
		// TODO Auto-generated method stub
        List<BackStation> list = backTrainDao.showStation();
		
		return list;
	}
	
	

}
