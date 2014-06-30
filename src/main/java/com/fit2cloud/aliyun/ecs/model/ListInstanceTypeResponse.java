package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class ListInstanceTypeResponse extends Response {
	private InstanceTypes InstanceTypes;

	public InstanceTypes getInstanceTypes() {
		return InstanceTypes;
	}
	
	public class InstanceTypes {
		List<InstanceType> InstanceType;

		public List<InstanceType> getList() {
			return InstanceType;
		}

		public class InstanceType {
			private String InstanceTypeId;
			private int CpuCoreCount;
			private double MemorySize;
			public String getInstanceTypeId() {
				return InstanceTypeId;
			}
			public void setInstanceTypeId(String instanceTypeId) {
				InstanceTypeId = instanceTypeId;
			}
			public int getCpuCoreCount() {
				return CpuCoreCount;
			}
			public void setCpuCoreCount(int cpuCoreCount) {
				CpuCoreCount = cpuCoreCount;
			}
			public double getMemorySize() {
				return MemorySize;
			}
			public void setMemorySize(double memorySize) {
				MemorySize = memorySize;
			}
			@Override
			public String toString() {
				return "InstanceType [InstanceTypeId=" + InstanceTypeId
						+ ", CpuCoreCount=" + CpuCoreCount + ", MemorySize="
						+ MemorySize + "]";
			}
		}
	}

}
