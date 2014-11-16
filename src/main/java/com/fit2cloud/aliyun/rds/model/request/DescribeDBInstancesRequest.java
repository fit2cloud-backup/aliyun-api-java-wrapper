package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class DescribeDBInstancesRequest extends PageableRequest {
	private String RegionId;
	private String Engine;
	private String DBInstanceType;
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getDBInstanceType() {
		return DBInstanceType;
	}
	public void setDBInstanceType(String dBInstanceType) {
		DBInstanceType = dBInstanceType;
	}
}
