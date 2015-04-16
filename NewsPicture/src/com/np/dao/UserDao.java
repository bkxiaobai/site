package com.np.dao;


import java.util.List;
import com.np.po.User;

//UserDao�ӿ�
public interface UserDao {
	
//���ݱ�ʶ�����������û�,��Ҫ�����û���id,ָ��id��Ӧ���û�	 
	User get(Integer id);

//�־û��û�
	Integer save(User user);

//�޸��û�
	void update(User user);

//ɾ��ָ���û�
	void delete(User user);

//����idɾ���û�
	void delete(Integer id);

//��ѯȫ���û�
	List<User> findAll();

//�����û��������û�
	User findByName(String username);
}
