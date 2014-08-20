package com.fit2cloud.aliyun.ecs.model;

public class OperationLock {
	private String LockReason;

	public String getLockReason() {
		return LockReason;
	}

	public void setLockReason(String lockReason) {
		LockReason = lockReason;
	}

	@Override
	public String toString() {
		return "OperationLock [LockReason=" + LockReason + "]";
	}

}