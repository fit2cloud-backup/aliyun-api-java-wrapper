package com.fit2cloud.aliyun;

public class AliyunServiceException extends Exception {

	private static final long serialVersionUID = -4188284834046139591L;

    private String requestId;

    private String errorCode;

    private String errorMessage;

    private int statusCode;

    private String serviceName;

    public AliyunServiceException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AliyunServiceException(String errorMessage, Exception cause) {
        super(null, cause);
        this.errorMessage = errorMessage;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return getErrorMessage()
            + "(Status Code: " + getStatusCode()
            + "; Error Code: " + getErrorCode()
            + "; Request ID: " + getRequestId() + ")";
    }
}
