package com.cbis.service;

import com.cbis.entity.User;

/**
 * user��service��
 * @author fyh
 * date:2018.06.30-16:08
 */
public interface UserService {
	
	//�û�ע��ķ���
	public boolean userRegister(User user);
	
	//�û���¼�ķ���
	public User userLogin(User user);
	
	//��֤�û����Ƿ���ڵķ���
	public boolean queryUserName(String userName);
	
	

}
