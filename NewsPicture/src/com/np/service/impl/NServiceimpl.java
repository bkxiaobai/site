package com.np.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.np.dao.PhotoDao;
import com.np.dao.UserDao;
import com.np.exception.NException;
import com.np.po.Photo;
import com.np.po.User;
import com.np.service.NService;
import com.np.vo.PhotoHolder;

public class NServiceimpl implements NService {
	// ҵ���߼������������2��DAO���
	private UserDao ud = null;
	private PhotoDao pd = null;

	// ����ע��2��DAO��������setter����
	public void setUserDao(UserDao ud) {
		this.ud = ud;
	}

	public void setPhotoDao(PhotoDao pd) {
		this.pd = pd;
	}

	/**
	 * ��֤�û���¼�Ƿ�ɹ���
	 * 
	 * @param username
	 *            ��¼���û���
	 * @param password
	 *            ��¼������
	 * @return �û���¼�Ľ�����ɹ�����true�����򷵻�false
	 */
	public boolean userLogin(String username, String password) {
		try {
			// ʹ��UserDao�����û�����ѯ�û�
			User u = ud.findByName(username);
			if (u != null && u.getPass().equals(password)) {
				return true;
			}
			return false;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new NException("�����û���¼�����쳣��");
		}
	}

	/**
	 * ע�����û�
	 * 
	 * @param name
	 *            ��ע���û����û���
	 * @param pass
	 *            ��ע���û�������
	 * @return ��ע���û�������
	 */
	public int registUser(String username, String password) {
		try {
			// ����һ���µ�Userʵ��
			User u = new User();
			u.setName(username);
			u.setPass(password);
			// �־û�User����
			ud.save(u);
			return u.getId();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new NException("���û�ע������쳣��");
		}
	}

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
	public int addPhoto(String user, String title, String fileName) {
		try {
			// ����һ���µ�Photoʵ��
			Photo p = new Photo();
			p.setTitle(title);
			p.setFileName(fileName);
			p.setUser(ud.findByName(user));
			// �־û�Photoʵ��
			pd.save(p);
			return p.getId();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new NException("�����Ƭ�����г����쳣��");
		}
	}

	/**
	 * �����û���ø��û���������Ƭ
	 * 
	 * @param user
	 *            ��ǰ�û�
	 * @param pageNo
	 *            ҳ��
	 * @return �������ڸ��û���ָ��ҳ����Ƭ
	 */
	public List<PhotoHolder> getPhotoByUser(String user, int pageNo) {
		try {
			List<Photo> pl = pd.findByUser(ud.findByName(user), pageNo);
			List<PhotoHolder> result = new ArrayList<PhotoHolder>();
			for (Photo p : pl) {
				result.add(new PhotoHolder(p.getTitle(), p.getFileName()));
			}
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new NException("��ѯ��Ƭ�б�Ĺ����г����쳣��");
		}
	}

	/**
	 * ��֤�û����Ƿ���ã������ݿ����Ƿ��Ѿ����ڸ��û���
	 * 
	 * @param name
	 *            ��ҪУ����û���
	 * @return ������û������ã�����true�����򷵻�false��
	 */
	public boolean validateName(String username) {
		try {
			// �����û�����ѯ��Ӧ��Userʵ��
			User u = ud.findByName(username);
			if (u != null) {
				return false;
			}
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new NException("��֤�û����Ƿ���ڵĹ����г����쳣��");
		}
	}
}
