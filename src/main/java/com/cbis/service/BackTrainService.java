package com.cbis.service;

import java.util.List;

import com.cbis.entity.BackPas;
import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;
import com.cbis.entity.BackUser;
import com.cbis.entity.Orders;

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
	
	//��̨��ʾ���е��û���Ϣ��
	public List<BackUser> showUser();
	
	//������ʾ�û��󶨵����г˿ͱ�
	public List<BackPas> showPas(int userId);
	
	//��ѯ���ж���
	public List<Orders> queryAllOrders();

}
