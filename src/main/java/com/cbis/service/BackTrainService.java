package com.cbis.service;

import java.util.List;

import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;

/**
 * ��̨������Ϣ��service��
 * @author fyh
 * 2018��7��6��14:07:08
 */
public interface BackTrainService {
	
	//��̨��ʾ���еĳ�����Ϣ��
	public List<BackTrain> showTrain();
	
	//��̨��ʾ���е� ��վ��Ϣ��
	public List<BackStation> showStation();

}
