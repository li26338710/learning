package com.elearning.api.web.controller.requestbean;

public class RecorderRequestBean {

	private String openId;
	private String nickname;
	private String province;
	private String city;
	private String gender;
	
	public RecorderRequestBean(String openId, String nickname, String province, String city, String gender) {
		super();
		this.openId = openId;
		this.nickname = nickname;
		this.province = province;
		this.city = city;
		this.gender = gender;
	}
	
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
