package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class DescribeParameterTemplatesRequest extends Request{
	private String Engine; 
	private String EngineVersion;
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getEngineVersion() {
		return EngineVersion;
	}
	public void setEngineVersion(String engineVersion) {
		EngineVersion = engineVersion;
	}
}
