package com.np.vo;

public class PhotoHolder {
	// ��Ƭ������
	private String title;
	// ��Ƭ�ڷ������ϵ��ļ���
	private String fileName;

	// �޲����Ĺ�����
	public PhotoHolder() {
	}

	// ��ʼ��ȫ�����ԵĹ�����
	public PhotoHolder(String title, String fileName) {
		this.title = title;
		this.fileName = fileName;
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
}
