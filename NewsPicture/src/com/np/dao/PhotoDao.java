package com.np.dao;

import java.util.List;
import com.np.po.Photo;
import com.np.po.User;


//PhotoDao�ӿ�
public interface PhotoDao {
	// �Գ�������ÿҳ��ʾ����Ƭ��
	final int PAGE_SIZE = 8;

	//����id����photoʵ��
	Photo get(Integer id);

	//�־û�photoʵ��
	Integer save(Photo photo);

	//�޸�ָ����photoʵ��
	void update(Photo photo);

	//ɾ��ָ����photoʵ��
	void delete(Photo photo);

	//����idɾ��photoʵ��
	void delete(Integer id);

	//��ѯȫ����photoʵ��
	List<Photo> findAll();

   //��ѯ����ָ���û�����Ƭ���ҽ��з�ҳ���ƣ�user:��ѯ��Ƭ�������û�,pageNo��Ҫ��ѯ��ָ��ҳ,return��ѯ������Ƭ
	List<Photo> findByUser(User user, int pageNo);
}

