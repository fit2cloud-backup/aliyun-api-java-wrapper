package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

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

	public void buildCIDRAndIcmpRequest(String RegionId, String SecurityGroupId, String cidr){
		this.RegionId = RegionId;
		this.SecurityGroupId = SecurityGroupId;
		this.IpProtocol = "ICMP";
		this.NicType = "internet";
		this.SourceCidrIp = cidr;
		this.PortRange = "-1/-1";
	}
	
	public void buildCIDRAndGreRequest(String RegionId, String SecurityGroupId, String cidr){
		this.RegionId = RegionId;
		this.SecurityGroupId = SecurityGroupId;
		this.IpProtocol = "GRE";
		this.NicType = "internet";
		this.SourceCidrIp = cidr;
		this.PortRange = "-1/-1";
	}

	public void buildCIDRAndAllProtocolRequest(String RegionId, String SecurityGroupId, String cidr){
		this.RegionId = RegionId;
		this.SecurityGroupId = SecurityGroupId;
		this.IpProtocol = "ALL";
		this.NicType = "internet";
		this.SourceCidrIp = cidr;
		this.PortRange = "-1/-1";
	}
	
	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getIpProtocol() {
		return IpProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		IpProtocol = ipProtocol;
	}

	public String getPortRange() {
		return PortRange;
	}

	public void setPortRange(String portRange) {
		PortRange = portRange;
	}

	public String getSourceGroupId() {
		return SourceGroupId;
	}

	public void setSourceGroupId(String sourceGroupId) {
		SourceGroupId = sourceGroupId;
	}

	public String getSourceCidrIp() {
		return SourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		SourceCidrIp = sourceCidrIp;
	}

	public String getPolicy() {
		return Policy;
	}

	public void setPolicy(String policy) {
		Policy = policy;
	}

	public String getNicType() {
		return NicType;
	}

	public void setNicType(String nicType) {
		NicType = nicType;
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

