package com.fit2cloud.aliyun.rds.model;

import java.util.ArrayList;
import java.util.List;

public class BinLogFiles {
	private List<BinLogFile> BinLogFile = new ArrayList<BinLogFile>();

	public List<BinLogFile> getBinLogFile() {
		return BinLogFile;
	}

	public void setBinLogFile(List<BinLogFile> binLogFile) {
		BinLogFile = binLogFile;
	}
}
