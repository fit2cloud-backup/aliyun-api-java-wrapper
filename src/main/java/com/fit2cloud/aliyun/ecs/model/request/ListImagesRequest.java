package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.PageableRequest;

public class ListImagesRequest extends PageableRequest {

	// required
	private String RegionId;

	// other fields
	private String ImageId;
	private String SnapshotId;
	private String ImageName;
	private String ImageOwnerAlias;

	/**
	 * 当 PageNumber 和 PageSize 均没设置时,默认取回所有数据,且无RequestId信息
	 * 
	 * @param RegionId
	 */
	public ListImagesRequest(String RegionId) {
		this.RegionId = RegionId;
	}
	
	public String getRegionId() {
		return RegionId;
	}

	/**
	 * @param regionId
	 *            实例所属于的 Region ID
	 */
	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getImageId() {
		return ImageId;
	}

	/**
	 * @param imageId
	 *            镜像 ID,可以输入多个,以”,”分割
	 */
	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getSnapshotId() {
		return SnapshotId;
	}

	/**
	 * @param snapshotId
	 *            创建镜像的快照 ID
	 */
	public void setSnapshotId(String snapshotId) {
		SnapshotId = snapshotId;
	}

	public String getImageName() {
		return ImageName;
	}

	/**
	 * @param imageName
	 *            镜像的名称
	 */
	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	public String getImageOwnerAlias() {
		return ImageOwnerAlias;
	}

	/**
	 * @param imageOwnerAlias
	 *            镜像所有者别名。 
	 *            取值: System| self| others| marketplace 
	 *            默认值:无,表示返回 system+self+others 
	 *            不设置该参数说明不使用该参数进行过滤 
	 *            取值说明: 
	 *            system >> 阿里云官方提供镜像 
	 *            self >> 用户自定义镜像 
	 *            others >> 非自己的可用镜像 
	 *            marketplace >> 镜像市场提供的镜像
	 */
	public void setImageOwnerAlias(String imageOwnerAlias) {
		ImageOwnerAlias = imageOwnerAlias;
	}

	@Override
	public String toString() {
		return "ListImagesRequest [RegionId=" + RegionId + ", PageNumber="
				+ PageNumber + ", PageSize=" + PageSize + ", ImageId="
				+ ImageId + ", SnapshotId=" + SnapshotId + ", ImageName="
				+ ImageName + ", ImageOwnerAlias=" + ImageOwnerAlias + "]";
	}

}
