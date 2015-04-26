package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class DescribeInstancesRequest extends PageableRequest {
	private String RegionId;
	private String ZoneId;
	
	private String VpcId;
	private String VSwitchId;
	private String InstanceIds;
	private String InstanceNetworkType;
	private String PrivateIpAddresses;
	private String InnerIpAddresses;
	private String PublicIpAddresses;
	private String SecurityGroupId;
	
	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param regionId
	 */
	public DescribeInstancesRequest(String regionId) {
		super();
		RegionId = regionId;
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

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getVSwitchId() {
		return VSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		VSwitchId = vSwitchId;
	}

	public String getInstanceIds() {
		return InstanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		InstanceIds = instanceIds;
	}

	public String getInstanceNetworkType() {
		return InstanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		InstanceNetworkType = instanceNetworkType;
	}

	public String getPrivateIpAddresses() {
		return PrivateIpAddresses;
	}

	public void setPrivateIpAddresses(String privateIpAddresses) {
		PrivateIpAddresses = privateIpAddresses;
	}

	public String getInnerIpAddresses() {
		return InnerIpAddresses;
	}

	public void setInnerIpAddresses(String innerIpAddresses) {
		InnerIpAddresses = innerIpAddresses;
	}

	public String getPublicIpAddresses() {
		return PublicIpAddresses;
	}

	public void setPublicIpAddresses(String publicIpAddresses) {
		PublicIpAddresses = publicIpAddresses;
	}

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	@Override
	public String toString() {
		return "DescribeInstancesRequest [RegionId=" + RegionId + ", ZoneId="
				+ ZoneId + ", VpcId=" + VpcId + ", VSwitchId=" + VSwitchId
				+ ", InstanceIds=" + InstanceIds + ", InstanceNetworkType="
				+ InstanceNetworkType + ", PrivateIpAddresses="
				+ PrivateIpAddresses + ", InnerIpAddresses=" + InnerIpAddresses
				+ ", PublicIpAddresses=" + PublicIpAddresses
				+ ", SecurityGroupId=" + SecurityGroupId + ", PageNumber="
				+ PageNumber + ", PageSize=" + PageSize + "]";
	}
}
