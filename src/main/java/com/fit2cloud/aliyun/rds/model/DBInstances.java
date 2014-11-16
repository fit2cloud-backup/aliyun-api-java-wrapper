package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class DBInstances {
	private List<DBInstance> DBInstance = new ArrayList<DBInstance>();

	public List<DBInstance> getDBInstance() {
		return DBInstance;
	}

	public void setDBInstance(List<DBInstance> dBInstance) {
		DBInstance = dBInstance;
	}
}
