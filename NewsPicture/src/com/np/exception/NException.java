package com.np.exception;

@SuppressWarnings("serial")
public class NException extends RuntimeException {

		// �ṩһ���޲����Ĺ�����
		public NException() {
		}

		// �ṩһ�����ַ��������Ĺ�����
		public NException(String msg) {
			super(msg);
		}
	}

