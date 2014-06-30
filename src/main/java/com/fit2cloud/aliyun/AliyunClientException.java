package com.fit2cloud.aliyun;

public class AliyunClientException extends Exception {

	private static final long serialVersionUID = -2733293738495171362L;

	public AliyunClientException(String message, Throwable t) {
        super(message, t);
    }

    public AliyunClientException(String message) {
        super(message);
    }

}
