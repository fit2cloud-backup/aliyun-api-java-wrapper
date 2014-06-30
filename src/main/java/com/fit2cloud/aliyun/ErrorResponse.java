package com.fit2cloud.aliyun;

public class ErrorResponse {
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public String getHostId() {
		return HostId;
	}
	public void setHostId(String hostId) {
		HostId = hostId;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	private String RequestId;
	private String HostId;
	private String Code;
	private String Message;
	
}
