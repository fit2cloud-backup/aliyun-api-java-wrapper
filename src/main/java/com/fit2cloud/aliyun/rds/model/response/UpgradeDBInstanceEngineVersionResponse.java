package com.fit2cloud.aliyun.rds.model.response;

import com.fit2cloud.aliyun.Response;

public class UpgradeDBInstanceEngineVersionResponse extends Response {
	private Integer TaskId;

	public Integer getTaskId() {
		return TaskId;
	}

	public void setTaskId(Integer taskId) {
		TaskId = taskId;
	}
}
