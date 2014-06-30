package com.fit2cloud.aliyun.ecs.model;

public class CreateInstanceRequest extends Request{
	
	private String RegionId;
	private String InstanceType;
	private String ImageId;
	private String InternetChargeType; //PayByBandwidth, PayByTraffic
	private String InternetMaxBandwidthOut;
	private String SecurityGroupId;
	private String InstanceName;
	private String Password;
	
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getInstanceType() {
		return InstanceType;
	}
	public void setInstanceType(String instanceType) {
		InstanceType = instanceType;
	}
	public String getImageId() {
		return ImageId;
	}
	public void setImageId(String imageId) {
		ImageId = imageId;
	}
	public String getInternetChargeType() {
		return InternetChargeType;
	}
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	public String getInternetMaxBandwidthOut() {
		return InternetMaxBandwidthOut;
	}
	public void setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
		InternetMaxBandwidthOut = internetMaxBandwidthOut;
	}
	public String getSecurityGroupId() {
		return SecurityGroupId;
	}
	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}
	public String getInstanceName() {
		return InstanceName;
	}
	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "CreateInstanceRequest [RegionId=" + RegionId
				+ ", InstanceType=" + InstanceType + ", ImageId=" + ImageId
				+ ", InternetChargeType=" + InternetChargeType
				+ ", InternetMaxBandwidthOut=" + InternetMaxBandwidthOut
				+ ", SecurityGroupId=" + SecurityGroupId + ", InstanceName="
				+ InstanceName + ", Password=" + Password + "]";
	}
	
}
