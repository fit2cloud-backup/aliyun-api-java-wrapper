package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateDatabaseRequest extends Request {
	private String DBInstanceId;
	private String DBName;
	private String CharacterSetName;
	private String DBDescription;
	public String getDBInstanceId() {
		return DBInstanceId;
	}
	public void setDBInstanceId(String dBInstanceId) {
		DBInstanceId = dBInstanceId;
	}
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public String getCharacterSetName() {
		return CharacterSetName;
	}
	public void setCharacterSetName(String characterSetName) {
		CharacterSetName = characterSetName;
	}
	public String getDBDescription() {
		return DBDescription;
	}
	public void setDBDescription(String dBDescription) {
		DBDescription = dBDescription;
	}
}
