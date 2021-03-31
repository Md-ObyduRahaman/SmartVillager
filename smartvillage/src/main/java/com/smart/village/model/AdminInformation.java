package com.smart.village.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminInformation {
	private String name;
	private String nationality;
	private String address;
	private String website;
	private String twitter;
	private String instagram;
	private String facebook;
	@Id
	private String issocode;
	private String city;
	@Column(unique = true)
	private String email;
	private String phone;
	private String imageUrl;
	private String role;
	private String password;
	
	

	public AdminInformation() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminInformation [name=" + name + ", nationality=" + nationality + ", address=" + address + ", website="
				+ website + ", twitter=" + twitter + ", instagram=" + instagram + ", facebook=" + facebook
				+ ", issocode=" + issocode + ", city=" + city + ", email=" + email + ", phone=" + phone + ", imageUrl="
				+ imageUrl + ", role=" + role + ", password=" + password + "]";
	}
	
	
	
}
