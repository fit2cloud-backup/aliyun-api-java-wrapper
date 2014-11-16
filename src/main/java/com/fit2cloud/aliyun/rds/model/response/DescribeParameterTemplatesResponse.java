package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.model.TemplateRecords;

public class DescribeParameterTemplatesResponse extends Response {
	private String Engine; 
	private String EngineVersion; 
	private Integer ParameterCount; 
	private TemplateRecords Parameters;
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
	public Integer getParameterCount() {
		return ParameterCount;
	}
	public void setParameterCount(Integer parameterCount) {
		ParameterCount = parameterCount;
	}
	public TemplateRecords getParameters() {
		return Parameters;
	}
	public void setParameters(TemplateRecords parameters) {
		Parameters = parameters;
	}
}
