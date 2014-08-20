package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.Response;
import com.fit2cloud.aliyun.ecs.model.InnerIpAddress;
import com.fit2cloud.aliyun.ecs.model.OperationLocks;
import com.fit2cloud.aliyun.ecs.model.PublicIpAddress;
import com.fit2cloud.aliyun.ecs.model.SecurityGroupIds;

public class GetInstanceResponse extends Response {
	
	private String InstanceId;
	private String ImageId;
	private String RegionId;
	private String InstanceType;
	private String HostName;
	private PublicIpAddress PublicIpAddress;
	private InnerIpAddress InnerIpAddress;
	private SecurityGroupIds SecurityGroupIds;
	private String InternetMaxBandwidthOut;
	private String InternetMaxBandwidthIn;
	private String InternetChargeType;
	private String Status;
	
	private String CreationTime;
	private String Description;
	private String InstanceName;
	private String ZoneId;
	private OperationLocks OperationLocks;
	private String SerialNumber;
	private String VlanId;
	private String ClusterId;
	
//	 * "InternetChargeType":"PayByTraffic",
//	 * "CreationTime":"2014-08-07T06:40:35Z",
//	 * "Description":"",
//	 * "HostName":"iZ28958hyimZ",
//	 * "ImageId":"centos6u5_64_20G_aliaegis_20140703.vhd",
//	 * "InnerIpAddress":{"IpAddress":["10.163.165.63"]},
//	 * "InstanceId":"i-28958hyim",
//	 * "InstanceName":"stability-test--centos-qingdao--10139",
//	 * "InstanceType":"ecs.t1.xsmall",
//	 * "InternetMaxBandwidthIn":200,
//	 * "InternetMaxBandwidthOut":100,
//	 * "ZoneId":"cn-qingdao-b",
//	 * "OperationLocks":{"OperationLock":[]},
//	 * "PublicIpAddress":{"IpAddress":["114.215.104.76"]},
//	 * "RegionId":"cn-qingdao",
//	 * "SecurityGroupIds":{"SecurityGroupId":["Gcd9456ec-7325-4cc4-bf6b-b58db1f2936d","Gb85859f6-7f8e-499c-bb88-a72e5f36b3e9"]},
//	 * "SerialNumber":"4ac56ecc-8535-4cf1-8853-3f16354210d5",
//	 * "Status":"Running",
//	 * "VlanId":"",
//	 * "ClusterId":"",
//	 * "RequestId":"8A15F627-566F-4F83-A207-146409AEC9E0"}
	
	
	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

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

	public String getHostName() {
		return HostName;
	}

	public void setHostName(String hostName) {
		HostName = hostName;
	}

	public PublicIpAddress getPublicIpAddress() {
		return PublicIpAddress;
	}

	public void setPublicIpAddress(PublicIpAddress publicIpAddress) {
		PublicIpAddress = publicIpAddress;
	}

	public InnerIpAddress getInnerIpAddress() {
		return InnerIpAddress;
	}

	public void setInnerIpAddress(InnerIpAddress innerIpAddress) {
		InnerIpAddress = innerIpAddress;
	}

	public SecurityGroupIds getSecurityGroupIds() {
		return SecurityGroupIds;
	}

	public void setSecurityGroupIds(SecurityGroupIds securityGroupIds) {
		SecurityGroupIds = securityGroupIds;
	}

	public String getInternetMaxBandwidthOut() {
		return InternetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
		InternetMaxBandwidthOut = internetMaxBandwidthOut;
	}

	public String getInternetMaxBandwidthIn() {
		return InternetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(String internetMaxBandwidthIn) {
		InternetMaxBandwidthIn = internetMaxBandwidthIn;
	}

	public String getInternetChargeType() {
		return InternetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getCreationTime() {
		return CreationTime;
	}

	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getInstanceName() {
		return InstanceName;
	}

	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}

	public String getZoneId() {
		return ZoneId;
	}

	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	public OperationLocks getOperationLocks() {
		return OperationLocks;
	}

	public void setOperationLocks(OperationLocks operationLocks) {
		OperationLocks = operationLocks;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public String getVlanId() {
		return VlanId;
	}

	public void setVlanId(String vlanId) {
		VlanId = vlanId;
	}

	public String getClusterId() {
		return ClusterId;
	}

	public void setClusterId(String clusterId) {
		ClusterId = clusterId;
	}

	@Override
	public String toString() {
		return "GetInstanceResponse [InstanceId=" + InstanceId + ", ImageId="
				+ ImageId + ", RegionId=" + RegionId + ", InstanceType="
				+ InstanceType + ", HostName=" + HostName
				+ ", PublicIpAddress=" + PublicIpAddress + ", InnerIpAddress="
				+ InnerIpAddress + ", SecurityGroupIds=" + SecurityGroupIds
				+ ", InternetMaxBandwidthOut=" + InternetMaxBandwidthOut
				+ ", InternetMaxBandwidthIn=" + InternetMaxBandwidthIn
				+ ", InternetChargeType=" + InternetChargeType + ", Status="
				+ Status + ", CreationTime=" + CreationTime + ", Description="
				+ Description + ", InstanceName=" + InstanceName + ", ZoneId="
				+ ZoneId + ", OperationLocks=" + OperationLocks
				+ ", SerialNumber=" + SerialNumber + ", VlanId=" + VlanId
				+ ", ClusterId=" + ClusterId + "]";
	}
}
