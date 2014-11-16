package com.fit2cloud.aliyun.rds.model;

public class TemplateRecord {
	private String ParameterName; 
	private String ParameterValue; 
	private String ForceModify; 
	private String ForceRestart; 
	private String CheckingCode; 
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
	public String getForceModify() {
		return ForceModify;
	}
	public void setForceModify(String forceModify) {
		ForceModify = forceModify;
	}
	public String getForceRestart() {
		return ForceRestart;
	}
	public void setForceRestart(String forceRestart) {
		ForceRestart = forceRestart;
	}
	public String getCheckingCode() {
		return CheckingCode;
	}
	public void setCheckingCode(String checkingCode) {
		CheckingCode = checkingCode;
	}
	public String getParameterDescription() {
		return ParameterDescription;
	}
	public void setParameterDescription(String parameterDescription) {
		ParameterDescription = parameterDescription;
	}
}
