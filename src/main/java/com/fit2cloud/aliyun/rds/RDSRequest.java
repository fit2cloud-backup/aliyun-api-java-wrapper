package com.fit2cloud.aliyun.rds;

import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.BaseModuleRequest;

public class RDSRequest extends BaseModuleRequest {

    private static final String API_VERSION = "2014-08-15";
	private static final String ENDPOINT = "http://rds.aliyuncs.com/";

	public RDSRequest(AliyunCredentials credentials) {
        super(credentials, ENDPOINT, API_VERSION);
    }
}
