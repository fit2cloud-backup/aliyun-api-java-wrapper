package com.fit2cloud.aliyun.ecs;

import com.fit2cloud.aliyun.AliyunCredentials;
import com.fit2cloud.aliyun.BaseModuleRequest;

public class ECSRequest extends BaseModuleRequest {

    private static final String API_VERSION = "2014-05-26";
	private static final String ENDPOINT = "http://ecs.aliyuncs.com/";

	public ECSRequest(AliyunCredentials credentials) {
        super(credentials, ENDPOINT, API_VERSION);
    }
}
