package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class Backups {
	private List<Backup> Backup = new ArrayList<Backup>();

	public List<Backup> getBackup() {
		return Backup;
	}

	public void setBackup(List<Backup> backup) {
		Backup = backup;
	}
}
