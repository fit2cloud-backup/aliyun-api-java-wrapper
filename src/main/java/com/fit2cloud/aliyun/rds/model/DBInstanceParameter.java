package com.fit2cloud.aliyun.rds.model;

public class DBInstanceParameter {
	private String ParameterName;
	private String ParameterValue;
	private String ParameterDescription;
	public String getParameterName() {
		return ParameterName;
	}
	public void setParameterName(String parameterName) {
		ParameterName = parameterName;
	}
	public String getParameterValue() {
		return ParameterValue;
	}
	public void setParameterValue(String parameterValue) {
		ParameterValue = parameterValue;
	}
	public String getParameterDescription() {
		return ParameterDescription;
	}
	public void setParameterDescription(String parameterDescription) {
		ParameterDescription = parameterDescription;
	}
}
