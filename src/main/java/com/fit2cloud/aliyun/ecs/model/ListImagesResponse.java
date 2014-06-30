package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class ListImagesResponse extends Response {
	private int TotalCount;
	private Images Images;
	
	public ListImagesResponse(){
		this.setTotalCount(0);
		Images = new Images();
	}

	public Images getImages() {
		return Images;
	}
	
	public int getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(int totalCount) {
		TotalCount = totalCount;
	}

	public class Images {
		List<Image> Image;
		
		public Images(){
			this.Image = new ArrayList<Image>();
		}

		public List<Image> getList() {
			return Image;
		}

		public class Image {
			private String ImageId;
			private String ImageName;
			private String Size;
			private String Architecture;
			private String OSName;
			private String ImageOwnerAlias;
			private String Platform;
			private String Description;
			private String Visibility;
			public String getImageId() {
				return ImageId;
			}
			public void setImageId(String imageId) {
				ImageId = imageId;
			}
			public String getSize() {
				return Size;
			}
			public void setSize(String size) {
				Size = size;
			}
			public String getImageName() {
				return ImageName;
			}
			public void setImageName(String imageName) {
				ImageName = imageName;
			}
			public String getArchitecture() {
				return Architecture;
			}
			public void setArchitecture(String architecture) {
				Architecture = architecture;
			}
			public String getOSName() {
				return OSName;
			}
			public void setOSName(String oSName) {
				OSName = oSName;
			}
			public String getImageOwnerAlias() {
				return ImageOwnerAlias;
			}
			public void setImageOwnerAlias(String imageOwnerAlias) {
				ImageOwnerAlias = imageOwnerAlias;
			}
			public String getPlatform() {
				return Platform;
			}
			public void setPlatform(String platform) {
				Platform = platform;
			}
			public String getDescription() {
				return Description;
			}
			public void setDescription(String description) {
				Description = description;
			}
			public String getVisibility() {
				return Visibility;
			}
			public void setVisibility(String visibility) {
				Visibility = visibility;
			}
			@Override
			public String toString() {
				return "Image [ImageId=" + ImageId + ", Size=" + Size
						+ ", ImageName=" + ImageName + ", Architecture="
						+ Architecture + ", OSName=" + OSName
						+ ", ImageOwnerAlias=" + ImageOwnerAlias
						+ ", Platform=" + Platform + ", Description="
						+ Description + ", Visibility=" + Visibility + "]";
			}
		}
	}
	
	public void add(ListImagesResponse response) {
		if (TotalCount == 0){
			this.TotalCount = response.getTotalCount();
		}
		this.getImages().getList().addAll(response.getImages().getList());
	}

}
