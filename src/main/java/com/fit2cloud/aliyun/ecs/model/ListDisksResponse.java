package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class ListDisksResponse{
		
	private Disks Disks;
	
	public Disks getDisks() {
		return Disks;
	}

	public void setDisks(Disks disks) {
		Disks = disks;
	}
	
	public class Disks {
		List<Disk> Disk;

		public List<Disk> getList() {
			return Disk;
		}

		public class Disk {
			private String DiskId;
			private int Size;
			private String Type;
			
			public String getDiskId() {
				return DiskId;
			}
			public void setDiskId(String diskId) {
				DiskId = diskId;
			}
			public int getSize() {
				return Size;
			}
			public void setSize(int size) {
				Size = size;
			}
			public String getType() {
				return Type;
			}
			public void setType(String type) {
				Type = type;
			}
			
			@Override
			public String toString() {
				return "Disk [DiskId=" + DiskId + ", Size=" + Size + ", Type="
						+ Type + "]";
			}
			
		}
	}

}
