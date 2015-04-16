package com.np.dao.impl;

import java.util.List;
import com.np.dao.PhotoDao;
import com.np.hql.NHibernateDaoSupport;
import com.np.po.Photo;
import com.np.po.User;

public class PhotoDaoimpl extends NHibernateDaoSupport implements
		PhotoDao {
	/**
	 * ���ݱ�ʶ����������Photoʵ��
	 * 
	 * @param id
	 *            ��Ҫ���ص�Photoʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Photoʵ��
	 */
	public Photo get(Integer pid) {
		return (Photo) getHibernateTemplate().get(Photo.class, pid);
	}

	/**
	 * �־û�ָ����Photoʵ��
	 * 
	 * @param photo
	 *            ��Ҫ���־û���Photoʵ��
	 * @return Photoʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(Photo photo) {
		return (Integer) getHibernateTemplate().save(photo);
	}

	/**
	 * �޸�ָ����Photoʵ��
	 * 
	 * @param photo
	 *            ��Ҫ���޸ĵ�Photoʵ��
	 */
	public void update(Photo photo) {
		getHibernateTemplate().update(photo);
	}

	/**
	 * ɾ��ָ����Photoʵ��
	 * 
	 * @param photo
	 *            ��Ҫ��ɾ����Photoʵ��
	 */
	public void delete(Photo photo) {
		getHibernateTemplate().delete(photo);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Photoʵ��
	 * 
	 * @param id
	 *            ��Ҫ��ɾ����Photoʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer pid) {
		getHibernateTemplate().delete(get(pid));
	}

	/**
	 * ��ѯȫ����Photoʵ��
	 * 
	 * @return ���ݿ���ȫ����Photoʵ��
	 */
	@SuppressWarnings("unchecked")
	public List<Photo> findAll() {
		return (List<Photo>) getHibernateTemplate().find("from Photo");
	}

	/**
	 * ��ѯ����ָ���û�����Ƭ���ҽ��з�ҳ����
	 * 
	 * @param user
	 *            ��ѯ��Ƭ�������û�
	 * @param pageNo
	 *            ��Ҫ��ѯ��ָ��ҳ
	 * @return ��ѯ������Ƭ
	 */
	@SuppressWarnings("unchecked")
	public List<Photo> findByUser(User user, int pageNo) {
		int offset = (pageNo - 1) * PAGE_SIZE;
		// ���ط�ҳ��ѯ�Ľ��
		return (List<Photo>) findByPage("from Photo b where b.user = ?", user,
				offset, PAGE_SIZE);
	}
}