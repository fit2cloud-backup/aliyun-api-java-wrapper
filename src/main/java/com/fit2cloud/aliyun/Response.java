package com.fit2cloud.aliyun;

public class Response {
	
	protected String RequestId;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	@Override
	public String toString() {
		return "Response [RequestId=" + RequestId + "]";
	}
	
}
