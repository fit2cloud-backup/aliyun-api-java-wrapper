package com.fit2cloud.aliyun.ecs.model.response;

import com.fit2cloud.aliyun.PageableResponse;
import com.fit2cloud.aliyun.ecs.model.Images;

public class ListImagesResponse extends PageableResponse {
	private Images Images = new Images();

	public void setImages(Images images) {
		Images = images;
	}

	public ListImagesResponse() {
		Images = new Images();
	}

	public Images getImages() {
		return Images;
	}

	public void add(PageableResponse response) {
		super.add(response);
		this.getImages().getImage().addAll(((ListImagesResponse) response).getImages().getImage());
	}

	@Override
	public String toString() {
		return "ListImagesResponse [TotalCount=" + TotalCount + ", Images="
				+ Images + ", PageSize=" + PageSize + ", PageNumber="
				+ PageNumber + "]";
	}

}
