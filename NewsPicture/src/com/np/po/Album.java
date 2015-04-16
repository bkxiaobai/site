package com.np.po;

import com.np.po.User;
import com.np.po.Column;

public class Album {
	// ͼ��ID
	private Integer aid;
	// ͼ������
	private String atitle;
	// �����ͼ���������û�
	private User user;
	// �����ͼ����������Ŀ
	private Column column;

	// �޲����Ĺ�����
	public Album() {
	}

	// ��ʼ��ȫ�����ԵĹ�����
	public Album(Integer aid, String atitle, User user,Column column) {
		this.aid = aid;
		this.atitle = atitle;
		this.user = user;
		this.column = column;
	}

	// id���Ե�setter��getter����
	public void setId(Integer aid) {
		this.aid = aid;
	}

	public Integer getId() {
		return this.aid;
	}

	// title���Ե�setter��getter����
	public void setTitle(String atitle) {
		this.atitle = atitle;
	}

	public String getTitle() {
		return this.atitle;
	}

	// user���Ե�setter��getter����
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}

	// column���Ե�setter��getter����
	public Column getColumn() {
		return this.column;
	}

	public void setColumn(Column column) {
		this.column = column;
	}
}