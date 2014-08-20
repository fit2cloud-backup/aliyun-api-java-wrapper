package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class Disks {
	List<Disk> Disk = new ArrayList<Disk>();

	public List<Disk> getDisk() {
		return Disk;
	}

	public void setDisk(List<Disk> disk) {
		Disk = disk;
	}

	public List<Disk> getList(){
		return Disk;
	}
	
	@Override
	public String toString() {
		return "Disks [Disk=" + Disk + "]";
	}

}