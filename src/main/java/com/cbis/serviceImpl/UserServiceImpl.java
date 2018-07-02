package com.cbis.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cbis.dao.UserDao;
import com.cbis.entity.User;
import com.cbis.entity.UserInfo;
import com.cbis.service.UserService;

/**
 * user��serviceʵ����
 * @author fyh
 * date:2018.06.30-16:08
 */
@Service(value="userService")
public class UserServiceImpl implements UserService{
	//ʵ����userDao
	@Resource
	private UserDao ud;
    
	/**
	 * �û�ע��ķ���
	 */
	@Override
	//����ĸ��뼶������úʹ������Ե�����
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public boolean  userRegister(User user) {
		// TODO Auto-generated method stub
		
		//�ж��Ƿ�ע��ɹ�
		boolean flag = ud.userRegister(user);
		//�½��û�������Ϣʵ��
		UserInfo userInfo = new UserInfo();
		//����userId
		userInfo.setUserId(user.getUserId());
		//�����û��˺�
		userInfo.setUserName(user.getUserName());
		//�����û�������
		userInfo.setUserEmail(user.getUserEmail());

		//���û�������Ϣ��
		boolean flag2 = ud.addUserInfo(userInfo);		
		//ʹ�������ж��Ƿ�ͬʱ����
		if (flag2 && flag) {
			return true;
		}
		
		
		return false;
	}
	
	
	/**
	 * �û���¼�ķ���
	 */
	public User userLogin(User user) {
		
		user = ud.userLogin(user);
				
		return user;
	}
    


	
	
	

}
