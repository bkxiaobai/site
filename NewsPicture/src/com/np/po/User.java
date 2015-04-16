package com.np.po;

import java.util.Set;
import java.util.HashSet;


public class User {
	// �û�ID
	private Integer id;
	// �û���
	private String username;
	// �û�����
	private String password;
	// ʹ��Set������û���������Ƭ
	private Set<Photo> photos = new HashSet<Photo>();
	// ʹ��Set������û�������ͼ��
	private Set<Album> albums = new HashSet<Album>();
	// ʹ��Set�������Ա��������Ŀ
	private Set<Column> columns = new HashSet<Column>();

	// �޲����Ĺ�����
	public User() {
	}

	// ��ʼ��ȫ�����ԵĹ�����
	public User(Integer id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	// id���Ե�setter��getter����
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	// name���Ե�setter��getter����
	public void setName(String username) {
		this.username = username;
	}

	public String getName() {
		return this.username;
	}

	// pass���Ե�setter��getter����
	public void setPass(String password) {
		this.password = password;
	}

	public String getPass() {
		return this.password;
	}

	// photos���Ե�setter��getter����
	public void setPhotos(Set<Photo> photos) {
		this.photos = photos;
	}

	public Set<Photo> getPhotos() {
		return this.photos;
	}
	// albums���Ե�setter��getter����
	public Set<Album> getAlbums() {
		return this.albums;
	}

	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}
	// columns���Ե�setter��getter����
	public Set<Column> getColumns() {
		return this.columns;
	}

	public void setColumns(Set<Column> columns) {
		this.columns = columns;
	}

}
