package com.np.po;

import com.np.po.User;
import com.np.po.Album;

public class Photo {
	// ͼƬID
	private Integer pid;
	// ��ͼƬ������
	private String title;
	// ͼƬ�ڷ������ϵ��ļ���
	private String fileName;
	// ��ͼƬ�Ĺؼ�������
	private String keyword;
	// �����ͼƬ�������û�
	private User user;
	// �����ͼƬ������ͼ��
	private Album album;

	// �޲����Ĺ�����
	public Photo() {
	}

	// ��ʼ��ȫ�����ԵĹ�����
	public Photo(Integer pid, String title, String fileName,String keyword, User user,Album album) {
		this.pid = pid;
		this.title = title;
		this.fileName = fileName;
		this.keyword = keyword;
		this.user = user;
		this.album =album;
	}

	// id���Ե�setter��getter����
	public void setId(Integer pid) {
		this.pid = pid;
	}

	public Integer getId() {
		return this.pid;
	}

	// title���Ե�setter��getter����
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	// fileName���Ե�setter��getter����
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	// keyword���Ե�setter��getter����
	public String getKeyword() {
		return this.keyword;
		}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		}
	
	// user���Ե�setter��getter����
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}

	// album���Ե�setter��getter����
	public Album getAlbum() {
		return this.album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}
	
	
}