package com.fit2cloud.aliyun.ecs.model;

public class Permission {
	private String IpProtocol;
	private String PortRange;
	private String SourceGroupId;
	private String Policy;
	private String NicType;
	private String SourceCidrIp;

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

	public String getSourceCidrIp() {
		return SourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		SourceCidrIp = sourceCidrIp;
	}

	@Override
	public String toString() {
		return "Permission [IpProtocol=" + IpProtocol + ", PortRange="
				+ PortRange + ", SourceGroupId=" + SourceGroupId + ", Policy="
				+ Policy + ", NicType=" + NicType + ", SourceCidrIp="
				+ SourceCidrIp + "]";
	}

}