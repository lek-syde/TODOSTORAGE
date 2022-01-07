package com.example.demo.models;


import java.io.Serializable;
import java.util.Base64;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

public class PersonalInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	
	

	@NotBlank
	private String fullname;

	

	@NotBlank
	private String phone;

	@NotBlank
	private String email;
	
	
	@NotBlank(message = "Please upload your passport photograph")
	private String imageurl;
	
	private String imagethumb;

	
	@NotBlank(message = "Please upload a valid Id")
	private String validID;
	
	private String idthumb;
	
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getValidID() {
		return validID;
	}

	public void setValidID(String validID) {
		this.validID = validID;
	}

	public String getImagethumb() {
		return imagethumb;
	}

	public void setImagethumb(String imagethumb) {
		this.imagethumb = imagethumb;
	}

	public String getIdthumb() {
		return idthumb;
	}

	public void setIdthumb(String idthumb) {
		this.idthumb = idthumb;
	}

	
	
	
	
}
