package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.model.DBInstanceParameters;

public class DescribeParametersResponse extends Response {
	private String Engine; 
	private String EngineVersion; 
	private DBInstanceParameters RunningParameters;
	private DBInstanceParameters ConfigParameters;
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
	public DBInstanceParameters getRunningParameters() {
		return RunningParameters;
	}
	public void setRunningParameters(DBInstanceParameters runningParameters) {
		RunningParameters = runningParameters;
	}
	public DBInstanceParameters getConfigParameters() {
		return ConfigParameters;
	}
	public void setConfigParameters(DBInstanceParameters configParameters) {
		ConfigParameters = configParameters;
	}
}
