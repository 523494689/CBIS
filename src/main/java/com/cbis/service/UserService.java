package com.cbis.service;

import com.cbis.entity.User;

/**
 * user��service��
 * @author Administrator
 *
 */
public interface UserService {
	
	//�û�ע��ķ���
	public boolean userRegister(User user);
	
	//�û���¼�ķ���
	public User userLogin(User user);
	
	

}
