package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class ReadOnlyDBInstanceIds {
	private List<ReadOnlyDBInstanceId> ReadOnlyDBInstanceId = new ArrayList<ReadOnlyDBInstanceId>();

	public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
		return ReadOnlyDBInstanceId;
	}

	public void setReadOnlyDBInstanceId(
			List<ReadOnlyDBInstanceId> readOnlyDBInstanceId) {
		ReadOnlyDBInstanceId = readOnlyDBInstanceId;
	}
}
