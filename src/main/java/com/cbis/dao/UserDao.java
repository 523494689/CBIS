package com.cbis.dao;

import org.springframework.stereotype.Repository;

import com.cbis.entity.User;
import com.cbis.entity.UserInfo;

/**
 * user��dao
 * @author fyh
 * date:2018.06.30-16:08
 */

@Repository(value="userDao")
public interface UserDao {
	
	//�û�ע��ķ���
	public boolean userRegister(User user);
	
	//�û���¼�ķ���
	public User userLogin(User user);
	
	//�û����û�������Ϣ��
	public boolean addUserInfo(UserInfo userInfo);
	
	//��֤�û����Ƿ��Ѵ���
	public User queryUserName(String userName);
	
	//�����û��������Ϣ
	public boolean updateUserInfo(UserInfo userInfo);
	
	//��ѯ��ӦuerId�û���������Ϣ
	public UserInfo queryUserInfoById(int userId);
	
}
