package com.np.dao.impl;

import java.util.List;
import com.np.dao.UserDao;
import com.np.hql.NHibernateDaoSupport;
import com.np.po.User;

public class UserDaoimpl extends NHibernateDaoSupport implements
		UserDao {
	/**
	 * ���ݱ�ʶ����������Userʵ��
	 * 
	 * @param id
	 *            ��Ҫ���ص�Userʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Userʵ��
	 */
	public User get(Integer id) {
		return (User) getHibernateTemplate().get(User.class, id);
	}

	/**
	 * �־û�ָ����Userʵ��
	 * 
	 * @param user
	 *            ��Ҫ���־û���Userʵ��
	 * @return Userʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(User user) {
		return (Integer) getHibernateTemplate().save(user);
	}

	/**
	 * �޸�ָ����Userʵ��
	 * 
	 * @param user
	 *            ��Ҫ���޸ĵ�Userʵ��
	 */
	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	/**
	 * ɾ��ָ����Userʵ��
	 * 
	 * @param user
	 *            ��Ҫ��ɾ����Userʵ��
	 */
	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Userʵ��
	 * 
	 * @param id
	 *            ��Ҫ��ɾ����Userʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * ��ѯȫ����Userʵ��
	 * 
	 * @return ���ݿ���ȫ����Userʵ��
	 */
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		return (List<User>) getHibernateTemplate().find("from User");
	}

	/**
	 * �����û��������û�
	 * 
	 * @param name
	 *            ��Ҫ���ҵ��û����û���
	 * @return ���ҵ����û�
	 */
	@SuppressWarnings("unchecked")
	public User findByName(String username) {
		List<User> users = (List<User>) getHibernateTemplate().find(
				"from User u where u.name = ?", username);
		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}
}
