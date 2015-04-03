package com.fit2cloud.aliyun.ecs.model;

public class VpcAttributesType {
	private String VpcId;
	private String VSwitchId;
	private String NatIpAddress;
	private IpAddressSetType PrivateIpAddress;
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
	public String getNatIpAddress() {
		return NatIpAddress;
	}
	public void setNatIpAddress(String natIpAddress) {
		NatIpAddress = natIpAddress;
	}
	public IpAddressSetType getPrivateIpAddress() {
		return PrivateIpAddress;
	}
	public void setPrivateIpAddress(IpAddressSetType privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}
	@Override
	public String toString() {
		return "VpcAttributesType [VpcId=" + VpcId + ", VSwitchId=" + VSwitchId
				+ ", NatIpAddress=" + NatIpAddress + ", PrivateIpAddress="
				+ PrivateIpAddress + "]";
	}
}
