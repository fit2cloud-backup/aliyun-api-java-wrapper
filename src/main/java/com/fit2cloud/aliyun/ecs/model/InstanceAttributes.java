package com.fit2cloud.aliyun.ecs.model;

public class InstanceAttributes {
	private String InstanceId;
	private String InstanceName;
	private String Description;
	private String ImageId;
	private String RegionId;
	private String ZoneId;
	private String InstanceType;
	private String HostName;
	private String Status;
	
	private SecurityGroupIds SecurityGroupIds;
	private IpAddressSetType PublicIpAddress;
	private InnerIpAddress InnerIpAddress;
	
	private int InternetMaxBandwidthIn;
	private int InternetMaxBandwidthOut;
	private String InternetChargeType;
	private String CreationTime;
	private VpcAttributesType VpcAttributes;
	private EipAddressAssociateType EipAddress;
	private String InstanceNetworkType;
	private OperationLocks OperationLocks;
	
	private String VlanId;
	private String ClusterId;
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getInstanceName() {
		return InstanceName;
	}
	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
	public String getZoneId() {
		return ZoneId;
	}
	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getInternetMaxBandwidthIn() {
		return InternetMaxBandwidthIn;
	}
	public void setInternetMaxBandwidthIn(int internetMaxBandwidthIn) {
		InternetMaxBandwidthIn = internetMaxBandwidthIn;
	}
	public int getInternetMaxBandwidthOut() {
		return InternetMaxBandwidthOut;
	}
	public void setInternetMaxBandwidthOut(int internetMaxBandwidthOut) {
		InternetMaxBandwidthOut = internetMaxBandwidthOut;
	}
	public String getInternetChargeType() {
		return InternetChargeType;
	}
	public void setInternetChargeType(String internetChargeType) {
		InternetChargeType = internetChargeType;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	public String getInstanceNetworkType() {
		return InstanceNetworkType;
	}
	public void setInstanceNetworkType(String instanceNetworkType) {
		InstanceNetworkType = instanceNetworkType;
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
	public SecurityGroupIds getSecurityGroupIds() {
		return SecurityGroupIds;
	}
	public void setSecurityGroupIds(SecurityGroupIds securityGroupIds) {
		SecurityGroupIds = securityGroupIds;
	}
	public IpAddressSetType getPublicIpAddress() {
		return PublicIpAddress;
	}
	public void setPublicIpAddress(IpAddressSetType publicIpAddress) {
		PublicIpAddress = publicIpAddress;
	}
	public InnerIpAddress getInnerIpAddress() {
		return InnerIpAddress;
	}
	public void setInnerIpAddress(InnerIpAddress innerIpAddress) {
		InnerIpAddress = innerIpAddress;
	}
	public VpcAttributesType getVpcAttributes() {
		return VpcAttributes;
	}
	public void setVpcAttributes(VpcAttributesType vpcAttributes) {
		VpcAttributes = vpcAttributes;
	}
	public EipAddressAssociateType getEipAddress() {
		return EipAddress;
	}
	public void setEipAddress(EipAddressAssociateType eipAddress) {
		EipAddress = eipAddress;
	}
	public OperationLocks getOperationLocks() {
		return OperationLocks;
	}
	public void setOperationLocks(OperationLocks operationLocks) {
		OperationLocks = operationLocks;
	}
	@Override
	public String toString() {
		return "InstanceAttributes [InstanceId=" + InstanceId
				+ ", InstanceName=" + InstanceName + ", Description="
				+ Description + ", ImageId=" + ImageId + ", RegionId="
				+ RegionId + ", ZoneId=" + ZoneId + ", InstanceType="
				+ InstanceType + ", HostName=" + HostName + ", Status="
				+ Status + ", SecurityGroupIds=" + SecurityGroupIds
				+ ", PublicIpAddress=" + PublicIpAddress + ", InnerIpAddress="
				+ InnerIpAddress + ", InternetMaxBandwidthIn="
				+ InternetMaxBandwidthIn + ", InternetMaxBandwidthOut="
				+ InternetMaxBandwidthOut + ", InternetChargeType="
				+ InternetChargeType + ", CreationTime=" + CreationTime
				+ ", VpcAttributes=" + VpcAttributes + ", EipAddress="
				+ EipAddress + ", InstanceNetworkType=" + InstanceNetworkType
				+ ", OperationLocks=" + OperationLocks + ", VlanId=" + VlanId
				+ ", ClusterId=" + ClusterId + "]";
	}
}
