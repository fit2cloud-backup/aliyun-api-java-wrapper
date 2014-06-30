package com.fit2cloud.aliyun.ecs.model;

public class AuthorizeOrRevokeSecurityGroupRequest extends Request{
	private String SecurityGroupId;
	private String RegionId;
	private String IpProtocol;
	private String PortRange;
	private String SourceGroupId;
	private String SourceCidrIp;
	private String Policy = "accept";
	private String NicType;
	
	public void buildCIDRAndTcpRequest(String RegionId, String SecurityGroupId, String cidr, int fromPort, int toPort){
		this.RegionId = RegionId;
		this.SecurityGroupId = SecurityGroupId;
		this.IpProtocol = "TCP";
		this.NicType = "internet";
		this.SourceCidrIp = cidr;
		this.PortRange = fromPort + "/" + toPort;
	}
	
	public void buildCIDRAndUdpRequest(String RegionId, String SecurityGroupId, String cidr, int fromPort, int toPort){
		this.RegionId = RegionId;
		this.SecurityGroupId = SecurityGroupId;
		this.IpProtocol = "UDP";
		this.NicType = "internet";
		this.SourceCidrIp = cidr;
		this.PortRange = fromPort + "/" + toPort;
	}
	
	@Override
	public String toString() {
		return "AuthorizeSecurityGroupRequest [SecurityGroupId="
				+ SecurityGroupId + ", RegionId=" + RegionId + ", IpProtocol="
				+ IpProtocol + ", PortRange=" + PortRange + ", SourceGroupId="
				+ SourceGroupId + ", SourceCidrIp=" + SourceCidrIp
				+ ", Policy=" + Policy + ", NicType=" + NicType + "]";
	}
}
