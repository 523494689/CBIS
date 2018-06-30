package com.cbis.dao;

import org.springframework.stereotype.Repository;

import com.cbis.entity.User;
import com.cbis.entity.UserInfo;

/**
 * user��dao
 * @author Administrator
 *
 */

@Repository(value="userDao")
public interface UserDao {
	
	//�û�ע��ķ���
	public boolean userRegister(User user);
	
	//�û���¼�ķ���
	public User userLogin(User user);
	
	//�û����û�������Ϣ��
	public boolean addUserInfo(UserInfo userInfo);

}
