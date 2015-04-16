package com.np.po;

import com.np.po.User;

public class Column {
	// 栏目ID
	private Integer cid;
	// 栏目名
	private String ctitle;
	// 保存该栏目所属的用户，在这里用户将只有管理员一个
	private User user;

	// 无参数的构造器
	public Column() {
	}

	// 初始化全部属性的构造器
	public Column(Integer cid, String ctitle,  User user) {
		this.cid = cid;
		this.ctitle = ctitle;
		this.user = user;
	}

	// id属性的setter和getter方法
	public void setId(Integer cid) {
		this.cid = cid;
	}

	public Integer getId() {
		return this.cid;
	}

	// title属性的setter和getter方法
	public void setTitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public String getTitle() {
		return this.ctitle;
	}


	// user属性的setter和getter方法
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}
}