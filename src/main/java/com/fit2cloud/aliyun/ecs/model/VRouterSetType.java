package com.fit2cloud.aliyun.ecs.model;

public class VRouterSetType {
	private String VRouterId;
	private String RegionId;
	private String VpcId;
	private RouteTableIds RouteTableIds;
	private String VRouterName;
	private String Description;
	private String CreationTime;
	public String getVRouterId() {
		return VRouterId;
	}
	public void setVRouterId(String vRouterId) {
		VRouterId = vRouterId;
	}
	public String getRegionId() {
		return RegionId;
	}
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}
	public String getVpcId() {
		return VpcId;
	}
	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}
	public RouteTableIds getRouteTableIds() {
		return RouteTableIds;
	}
	public void setRouteTableIds(RouteTableIds routeTableIds) {
		RouteTableIds = routeTableIds;
	}
	public String getVRouterName() {
		return VRouterName;
	}
	public void setVRouterName(String vRouterName) {
		VRouterName = vRouterName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	@Override
	public String toString() {
		return "VRouterSetType [VRouterId=" + VRouterId + ", RegionId="
				+ RegionId + ", VpcId=" + VpcId + ", RouteTableIds="
				+ RouteTableIds + ", VRouterName=" + VRouterName
				+ ", Description=" + Description + ", CreationTime="
				+ CreationTime + "]";
	}
}
