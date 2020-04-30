package com.example.demo.models;


import java.io.Serializable;
import java.util.Base64;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

public class PersonalInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private byte[] imageContent;
	
	MultipartFile image;

	@NotBlank
	private String fullname;

	

	@NotBlank
	private String phone;

	@NotBlank
	private String email;

	public byte[] getImageContent() {
		return imageContent;
	}

	public String getImageBase64() {
		return Base64.getEncoder().encodeToString(imageContent);
	}

	public void setImage(MultipartFile image) {
		try {
			this.imageContent = image.getBytes();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

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

	public void setImageContent(byte[] imageContent) {
		this.imageContent = imageContent;
	}

	public MultipartFile getImage() {
		return image;
	}

	
}
