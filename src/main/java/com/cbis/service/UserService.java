package com.cbis.service;

import com.cbis.entity.User;
import com.cbis.entity.UserInfo;

/**
 * user��service��
 * 
 * @author fyh date:2018.06.30-16:08
 */
public interface UserService {

	// �û�ע��ķ���
	public boolean userRegister(User user);

	// �û���¼�ķ���
	public User userLogin(User user);

	// ��֤�û����Ƿ���ڵķ���
	public boolean queryUserName(String userName);

	// �����û��������Ϣ
	public boolean updateUserInfo(UserInfo userInfo);

	// ��ѯ��ӦuerId�û���������Ϣ
	public UserInfo queryUserInfoById(int userId);

}
