package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class CreateImageRequest extends Request {
	// required
	private String RegionId;
	private String SnapshotId;

	// other fields
	private String ImageName;
	private String ImageVersion;
	private String Description;

	public CreateImageRequest(String RegionId, String SnapshotId) {
		this.RegionId = RegionId;
		this.SnapshotId = SnapshotId;
	}

	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            镜像所在的 Region ID
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	/**
	 * @param snapshotId
	 *            快照 ID。从指定的快照创建自定义镜像。
	 */
	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	public String getImageName() {
		return ImageName;
	}

	/**
	 * @param imageName
	 *            镜像名称,[2,128]英文或中文字符,必须以大 小字母或中文开头,可包含数字,”_”或”-” 。 不 能以
	 *            http://和 https://开头。
	 */
	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	public String getImageVersion() {
		return ImageVersion;
	}

	/**
	 * @param imageVersion
	 *            镜像版本号,长度限制在 1~40 个英文字符
	 */
	public void setImageVersion(String imageVersion) {
		ImageVersion = imageVersion;
	}

	public String getDescription() {
		return Description;
	}

	/**
	 * @param description
	 *            镜像的描述信息,长度限制在 0~256 个字符, 不填则为空, 默认为空。 不能以 http://和 https:// 开头
	 */
	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "CreateImageRequest [RegionId=" + RegionId + ", SnapshotId="
				+ SnapshotId + ", ImageName=" + ImageName + ", ImageVersion="
				+ ImageVersion + ", Description=" + Description + "]";
	}
}
