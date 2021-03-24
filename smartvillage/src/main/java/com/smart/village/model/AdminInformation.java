package com.smart.village.model;

public class AdminInformation {
	private String name;
	private String nationality;
	private String address;
	private String website;
	private String twitter;
	private String instagram;
	private String facebook;
	private String issocode;
	private String city;
	private String email;
	private String phone;
	public AdminInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminInformation(String name, String nationality, String address, String website, String twitter,
			String instagram, String facebook, String issocode, String city, String email, String phone) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.address = address;
		this.website = website;
		this.twitter = twitter;
		this.instagram = instagram;
		this.facebook = facebook;
		this.issocode = issocode;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getIssocode() {
		return issocode;
	}
	public void setIssocode(String issocode) {
		this.issocode = issocode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
