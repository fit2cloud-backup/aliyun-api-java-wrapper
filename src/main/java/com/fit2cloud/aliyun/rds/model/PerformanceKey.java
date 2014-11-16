package com.fit2cloud.aliyun.rds.model;

public class PerformanceKey {
	private String Key; 
	private String Unit; 
	private String ValueFormat; 
	private PerformanceValues Values;
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public String getValueFormat() {
		return ValueFormat;
	}
	public void setValueFormat(String valueFormat) {
		ValueFormat = valueFormat;
	}
	public PerformanceValues getValues() {
		return Values;
	}
	public void setValues(PerformanceValues values) {
		Values = values;
	}
}
