package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class ListInstancesResponse extends Response {
	private int TotalCount;
	private InstanceStatuses InstanceStatuses;
	
	public ListInstancesResponse(){
		this.setTotalCount(0);
		InstanceStatuses = new InstanceStatuses();
	}
	
	public int getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(int totalCount) {
		TotalCount = totalCount;
	}

	public InstanceStatuses getInstanceStatuses() {
		return InstanceStatuses;
	}

	public void setInstanceStatuses(InstanceStatuses instanceStatuses) {
		InstanceStatuses = instanceStatuses;
	}

	public class InstanceStatuses {
		List<InstanceStatus> InstanceStatus;
		
		public InstanceStatuses(){
			this.InstanceStatus = new ArrayList<InstanceStatus>();
		}

		public List<InstanceStatus> getList() {
			return InstanceStatus;
		}

		public class InstanceStatus {
			private String InstanceId;
			private String Status;
			public String getInstanceId() {
				return InstanceId;
			}
			public void setInstanceId(String instanceId) {
				InstanceId = instanceId;
			}
			public String getStatus() {
				return Status;
			}
			public void setStatus(String status) {
				Status = status;
			}
			@Override
			public String toString() {
				return "InstanceStatus [InstanceId=" + InstanceId + ", Status="
						+ Status + "]";
			}
		}
	}

	public void add(ListInstancesResponse response) {
		if (TotalCount == 0){
			this.TotalCount = response.getTotalCount();
		}
		this.getInstanceStatuses().getList().addAll(response.getInstanceStatuses().getList());
	}

}
