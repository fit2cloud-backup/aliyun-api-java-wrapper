package com.fit2cloud.aliyun.ecs.model;

public class AddDiskRequest extends Request{
	
	private String InstanceId;
	private String Size;
	private String SnapshotId = "";
	
	public AddDiskRequest(String InstanceId, int size){
		this.InstanceId = InstanceId;
		this.SnapshotId = "";
		this.Size = String.valueOf(size);
	}
	
	public AddDiskRequest(String InstanceId, String SnapshotId){
		this.InstanceId = InstanceId;
		this.SnapshotId = SnapshotId;
	}
	
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getSnapshotId() {
		return SnapshotId;
	}
	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

}
