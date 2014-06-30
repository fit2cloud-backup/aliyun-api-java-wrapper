package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class ListSecurityPermissionsResponse extends Response {
	private String Description;
	private Permissions Permissions;

	public Permissions getPermissions() {
		return Permissions;
	}
	

	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public class Permissions {
		List<Permission> Permission;

		public List<Permission> getList() {
			return Permission;
		}
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
			@Override
			public String toString() {
				return "Permission [IpProtocol=" + IpProtocol + ", PortRange="
						+ PortRange + ", SourceGroupId=" + SourceGroupId
						+ ", Policy=" + Policy + ", NicType=" + NicType + "]";
			}
			public String getSourceCidrIp() {
				return SourceCidrIp;
			}
			public void setSourceCidrIp(String sourceCidrIp) {
				SourceCidrIp = sourceCidrIp;
			}
			
		}
	}

}
