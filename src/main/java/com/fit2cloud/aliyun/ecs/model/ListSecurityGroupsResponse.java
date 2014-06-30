package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class ListSecurityGroupsResponse extends Response {
	
	private int TotalCount;
	private SecurityGroups SecurityGroups;
	
	public ListSecurityGroupsResponse(){
		this.TotalCount = 0;
		SecurityGroups = new SecurityGroups();
	}
	
	public int getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(int totalCount) {
		TotalCount = totalCount;
	}

	public void setSecurityGroups(SecurityGroups securityGroups) {
		SecurityGroups = securityGroups;
	}

	public SecurityGroups getSecurityGroups() {
		return SecurityGroups;
	}
	
	public class SecurityGroups {
		List<SecurityGroup> SecurityGroup;
		
		public SecurityGroups(){
			this.SecurityGroup = new ArrayList<SecurityGroup>();
		}

		public List<SecurityGroup> getList() {
			return SecurityGroup;
		}
		public class SecurityGroup {
			private String SecurityGroupId;
			private String Description;
			
			public String getSecurityGroupId() {
				return SecurityGroupId;
			}
			public void setSecurityGroupId(String securityGroupId) {
				SecurityGroupId = securityGroupId;
			}
			public String getDescription() {
				return Description;
			}
			public void setDescription(String description) {
				Description = description;
			}
			@Override
			public String toString() {
				return "SecurityGroup [SecurityGroupId=" + SecurityGroupId
						+ ", Description=" + Description + "]";
			}
		}
	}

	public void add(ListSecurityGroupsResponse response) {
		if (TotalCount == 0){
			this.TotalCount = response.getTotalCount();
		}
		this.getSecurityGroups().getList().addAll(response.getSecurityGroups().getList());
		
	}

}
