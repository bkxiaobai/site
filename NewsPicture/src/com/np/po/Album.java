package com.np.po;

import com.np.po.User;
import com.np.po.Column;

public class Album {
	// 图集ID
	private Integer aid;
	// 图集名称
	private String atitle;
	// 保存该图集所属的用户
	private User user;
	// 保存该图集所属的栏目
	private Column column;

	// 无参数的构造器
	public Album() {
	}

	// 初始化全部属性的构造器
	public Album(Integer aid, String atitle, User user,Column column) {
		this.aid = aid;
		this.atitle = atitle;
		this.user = user;
		this.column = column;
	}

	// id属性的setter和getter方法
	public void setId(Integer aid) {
		this.aid = aid;
	}

	public Integer getId() {
		return this.aid;
	}

	// title属性的setter和getter方法
	public void setTitle(String atitle) {
		this.atitle = atitle;
	}

	public String getTitle() {
		return this.atitle;
	}

	// user属性的setter和getter方法
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}

	// column属性的setter和getter方法
	public Column getColumn() {
		return this.column;
	}

	public void setColumn(Column column) {
		this.column = column;
	}
}