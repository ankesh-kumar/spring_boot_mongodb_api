package com.testapi.webapi.users;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class UsersModel {

	@Id
	private String id;
	private String userId;
	private String userName;
	private String userEmail;
	private String userAddress;
	private String userCountry;
	private String userGender;
	private String userPicurl;
	private String userOpenGroup;
	private String userChatWith;
	
	public UsersModel() {
		
	}

	public UsersModel(String id, String userId, String userName, String userEmail, String userAddress,
			String userCountry, String userGender, String userPicurl, String userOpenGroup, String userChatWith) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userCountry = userCountry;
		this.userGender = userGender;
		this.userPicurl = userPicurl;
		this.userOpenGroup = userOpenGroup;
		this.userChatWith = userChatWith;
	}
	
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserPicurl() {
		return userPicurl;
	}

	public void setUserPicurl(String userPicurl) {
		this.userPicurl = userPicurl;
	}

	public String getUserOpenGroup() {
		return userOpenGroup;
	}

	public void setUserOpenGroup(String userOpenGroup) {
		this.userOpenGroup = userOpenGroup;
	}

	public String getUserChatWith() {
		return userChatWith;
	}

	public void setUserChatWith(String userChatWith) {
		this.userChatWith = userChatWith;
	}


	
}
