package com.cbis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;

/**
 * ��̨�����dao
 * @author fyh
 * 2018��7��6��14:01:47
 */
@Repository
public interface BackTrainDao {
	
	//��ʾ������Ϣ�����Ϣ
	public List<BackTrain> showTrain();
	
	//��ʾ��վ·����Ϣ�����Ϣ
	public List<BackStation> showStation();

}
