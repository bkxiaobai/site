package com.np.service;

import java.util.List;
import com.np.vo.PhotoHolder;

public interface NService {
	/**
	 * ��֤�û���¼�Ƿ�ɹ���
	 * 
	 * @param username
	 *            ��¼���û���
	 * @param password
	 *            ��¼������
	 * @return �û���¼�Ľ�����ɹ�����true�����򷵻�false
	 */
	boolean userLogin(String username, String password);

	/**
	 * ע�����û�
	 * 
	 * @param username
	 *            ��ע���û����û���
	 * @param password
	 *            ��ע���û�������
	 * @return ��ע���û�������
	 */
	int registUser(String username, String password);

	/**
	 * �����Ƭ
	 * 
	 * @param user
	 *            �����Ƭ���û�
	 * @param title
	 *            �����Ƭ�ı���
	 * @param fileName
	 *            ������Ƭ�ڷ������ϵ��ļ���
	 * @return �������Ƭ������
	 */
	int addPhoto(String user, String title, String fileName);

	/**
	 * �����û���ø��û���������Ƭ
	 * 
	 * @param user
	 *            ��ǰ�û�
	 * @param pageNo
	 *            ҳ��
	 * @return �������ڸ��û���ָ��ҳ����Ƭ
	 */
	List<PhotoHolder> getPhotoByUser(String user, int pageNo);

	/**
	 * ��֤�û����Ƿ���ã������ݿ����Ƿ��Ѿ����ڸ��û���
	 * 
	 * @param username
	 *            ��ҪУ����û���
	 * @return ������û������ã�����true�����򷵻�false��
	 */
	boolean validateName(String username);
}
