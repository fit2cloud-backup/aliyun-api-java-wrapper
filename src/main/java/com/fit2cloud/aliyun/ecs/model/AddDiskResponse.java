package com.fit2cloud.aliyun.ecs.model;


public class AddDiskResponse extends Response {
	
	private String InstanceId;
	private String DiskId;
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getDiskId() {
		return DiskId;
	}
	public void setDiskId(String diskId) {
		DiskId = diskId;
	}
	@Override
	public String toString() {
		return "AddDiskResponse [InstanceId=" + InstanceId + ", DiskId="
				+ DiskId + "]";
	}


}
