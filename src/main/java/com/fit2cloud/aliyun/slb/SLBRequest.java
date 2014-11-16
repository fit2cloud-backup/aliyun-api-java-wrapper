package com.fit2cloud.aliyun.slb;

import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.BaseModuleRequest;

public class SLBRequest extends BaseModuleRequest {

    private static final String API_VERSION = "2014-05-15";
	private static final String ENDPOINT = "http://slb.aliyuncs.com/";

	public SLBRequest(AliyunCredentials credentials) {
        super(credentials, ENDPOINT, API_VERSION);
    }
}
