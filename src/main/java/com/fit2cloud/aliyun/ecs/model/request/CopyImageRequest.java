package com.fit2cloud.aliyun.ecs.model.request;

import com.fit2cloud.aliyun.Request;

public class CopyImageRequest extends Request {

	private String RegionId;
	private String ImageId;
	private String DestinationRegionId;
	private String DestinationImageName;
	private String DestinationDescription;
	
	public CopyImageRequest(String regionId, String imageId,
			String destinationRegionId, String destinationImageName, String destinationDescription) {
		RegionId = regionId;
		ImageId = imageId;
		DestinationRegionId = destinationRegionId;
		DestinationImageName = destinationImageName;
		DestinationDescription = destinationDescription;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public String getImageId() {
		return ImageId;
	}

	public void setImageId(String imageId) {
		ImageId = imageId;
	}

	public String getDestinationRegionId() {
		return DestinationRegionId;
	}

	public void setDestinationRegionId(String destinationRegionId) {
		DestinationRegionId = destinationRegionId;
	}

	public String getDestinationImageName() {
		return DestinationImageName;
	}

	public void setDestinationImageName(String destinationImageName) {
		DestinationImageName = destinationImageName;
	}

	public String getDestinationDescription() {
		return DestinationDescription;
	}

	public void setDestinationDescription(String destinationDescription) {
		DestinationDescription = destinationDescription;
	}

	@Override
	public String toString() {
		return "CopyImageRequest [RegionId=" + RegionId + ", ImageId="
				+ ImageId + ", DestinationRegionId=" + DestinationRegionId
				+ ", DestinationImageName=" + DestinationImageName
				+ ", DestinationDescription=" + DestinationDescription + "]";
	}
}
