package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.rds.model.Databases;

public class DescribeDatabasesResponse extends Response {
	private Databases Databases;

	public Databases getDatabases() {
		return Databases;
	}

	public void setDatabases(Databases databases) {
		Databases = databases;
	}
}
