package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class VpcSetTypes {
	List<VpcSetType> Vpc = new ArrayList<VpcSetType>();

	public List<VpcSetType> getVpc() {
		return Vpc;
	}

	public void setVpc(List<VpcSetType> vpc) {
		Vpc = vpc;
	}

	public List<VpcSetType> getList() {
		return Vpc;
	}

	@Override
	public String toString() {
		return "VpcSetTypes [Vpc=" + Vpc + "]";
	}
}