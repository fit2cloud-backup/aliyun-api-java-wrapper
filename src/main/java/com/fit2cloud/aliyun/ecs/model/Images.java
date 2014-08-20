package com.fit2cloud.aliyun.ecs.model;

import java.util.ArrayList;
import java.util.List;

public class Images {
	private List<Image> Image = new ArrayList<Image>();

	public List<Image> getImage() {
		return Image;
	}
	
	public void setImage(List<Image> image) {
		Image = image;
	}
	
	public List<Image> getList(){
		return Image;
	}

	@Override
	public String toString() {
		return "Images [Image=" + Image + "]";
	}
}