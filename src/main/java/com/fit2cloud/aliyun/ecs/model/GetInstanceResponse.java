package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

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
	
	public class PublicIpAddress {
		List<String> IpAddress;

		public List<String> getIpAddress() {
			return IpAddress;
		}

		public void setIpAddress(List<String> ipAddress) {
			IpAddress = ipAddress;
		}

		@Override
		public String toString() {
			return "PublicIpAddress [IpAddress=" + IpAddress + "]";
		}
		
	}
	
	public class InnerIpAddress {
		List<String> IpAddress;

		@Override
		public String toString() {
			return "InnerIpAddress [IpAddress=" + IpAddress + "]";
		}

		public List<String> getIpAddress() {
			return IpAddress;
		}

		public void setIpAddress(List<String> ipAddress) {
			IpAddress = ipAddress;
		}
	}
	
	public class SecurityGroupIds {
		List<String> SecurityGroupId;

		@Override
		public String toString() {
			return "SecurityGroupIds [SecurityGroupId=" + SecurityGroupId + "]";
		}

		public List<String> getSecurityGroupId() {
			return SecurityGroupId;
		}

		public void setSecurityGroupId(List<String> securityGroupId) {
			SecurityGroupId = securityGroupId;
		}
	}

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
				+ Status + "]";
	}
}
