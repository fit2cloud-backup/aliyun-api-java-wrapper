package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class JoinOrLeaveSecurityGroupRequest extends Request {
	private String InstanceId;
	private String SecurityGroupId;

	public JoinOrLeaveSecurityGroupRequest(String instanceId,
			String securityGroupId) {
		InstanceId = instanceId;
		SecurityGroupId = securityGroupId;
	}

	@Override
	public String toString() {
		return "JoinOrLeaveSecurityGroupRequest [InstanceId=" + InstanceId
				+ ", SecurityGroupId=" + SecurityGroupId + "]";
	}

}
