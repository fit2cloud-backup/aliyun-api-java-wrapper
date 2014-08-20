package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class OperationLocks {
	private List<OperationLock> OperationLock;

	public List<OperationLock> getOperationLock() {
		return OperationLock;
	}

	public void setOperationLock(List<OperationLock> operationLock) {
		OperationLock = operationLock;
	}

	public List<OperationLock> getList() {
		return OperationLock;
	}

	@Override
	public String toString() {
		return "OperationLocks [OperationLock=" + OperationLock + "]";
	}
}