package com.fit2cloud.aliyun.ecs.model;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Request {
	
	private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
	
	public Request(){
		
	}
    
    public Map<String, String> toMap(){
		Type type = new TypeToken<HashMap<String, String>>(){}.getType();
		return gson.fromJson(gson.toJson(this), type);
	}
}
