package com.fit2cloud.aliyun;

public class AliyunCredentials {
	private final String accessKey;
    private final String secretKey;

    public AliyunCredentials(String accessKey, String secretKey) {
        if (accessKey == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (secretKey == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }

        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getAccessKeyId() {
        return accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }
}
