package com.np.po;

import com.np.po.User;

public class Column {
	// ��ĿID
	private Integer cid;
	// ��Ŀ��
	private String ctitle;
	// �������Ŀ�������û����������û���ֻ�й���Աһ��
	private User user;

	// �޲����Ĺ�����
	public Column() {
	}

	// ��ʼ��ȫ�����ԵĹ�����
	public Column(Integer cid, String ctitle,  User user) {
		this.cid = cid;
		this.ctitle = ctitle;
		this.user = user;
	}

	// id���Ե�setter��getter����
	public void setId(Integer cid) {
		this.cid = cid;
	}

	public Integer getId() {
		return this.cid;
	}

	// title���Ե�setter��getter����
	public void setTitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public String getTitle() {
		return this.ctitle;
	}


	// user���Ե�setter��getter����
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}
}