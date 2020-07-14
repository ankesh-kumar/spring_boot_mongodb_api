package com.testapi.webapi.opengroup;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="open_group_message")
public class OpenGroupModel {
	
	@Id
	private String _id;
	private String _openg_id;
	private String userId;
	private String message;
	private String attachUrl;
	private String publishedOn;
	

	public OpenGroupModel() {
		
	}
	
	public OpenGroupModel(String _openg_id, String userId, String message, String attachUrl, String publishedOn) {
		super();
		this._openg_id = _openg_id;
		this.userId = userId;
		this.message = message;
		this.attachUrl = attachUrl;
		this.publishedOn = publishedOn;
	}
	
	
	public String get_openg_id() {
		return _openg_id;
	}
	public void set_openg_id(String _openg_id) {
		this._openg_id = _openg_id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAttachUrl() {
		return attachUrl;
	}
	public void setAttachUrl(String attachUrl) {
		this.attachUrl = attachUrl;
	}
	public String getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(String publishedOn) {
		this.publishedOn = publishedOn;
	}


}
