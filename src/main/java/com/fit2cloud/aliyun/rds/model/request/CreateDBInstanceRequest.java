package com.fit2cloud.aliyun.rds.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateDBInstanceRequest extends Request {
	private String RegionId;
	private String Engine;
	private String EngineVersion;
	private String DBInstanceClass;
	private Integer DBInstanceStorage;
	private String DBInstanceNetType;
	private String SecurityIPList;
	private String PayType;
	private String ClientToken;
	
	private String DBInstanceDescription;

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	public String getEngineVersion() {
		return EngineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		EngineVersion = engineVersion;
	}

	public String getDBInstanceClass() {
		return DBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		DBInstanceClass = dBInstanceClass;
	}

	public Integer getDBInstanceStorage() {
		return DBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		DBInstanceStorage = dBInstanceStorage;
	}

	public String getDBInstanceNetType() {
		return DBInstanceNetType;
	}

	public void setDBInstanceNetType(String dBInstanceNetType) {
		DBInstanceNetType = dBInstanceNetType;
	}

	public String getSecurityIPList() {
		return SecurityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		SecurityIPList = securityIPList;
	}

	public String getPayType() {
		return PayType;
	}

	public void setPayType(String payType) {
		PayType = payType;
	}

	public String getClientToken() {
		return ClientToken;
	}

	public void setClientToken(String clientToken) {
		ClientToken = clientToken;
	}

	public String getDBInstanceDescription() {
		return DBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		DBInstanceDescription = dBInstanceDescription;
	}

}
