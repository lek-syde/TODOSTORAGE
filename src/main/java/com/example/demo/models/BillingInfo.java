package com.example.demo.models;

import java.io.Serializable;
import java.util.Base64;

import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;


public class BillingInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String address;
	
	@NotBlank
	private String spaceType;
	
	@NotBlank
	private String state;
	
	
	@NotBlank
	private int spaceSize;
	
	MultipartFile spaceCred;
	
	
	private byte[] imageContent;
	
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpaceType() {
		return spaceType;
	}

	public void setSpaceType(String spaceType) {
		this.spaceType = spaceType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getSpaceSize() {
		return spaceSize;
	}

	public void setSpaceSize(int spaceSize) {
		this.spaceSize = spaceSize;
	}


	public byte[] getImageContent() {
		return imageContent;
	}

	public String getImageBase64() {
		return Base64.getEncoder().encodeToString(imageContent);
	}

	

	public MultipartFile getSpaceCred() {
		return spaceCred;
	}

	public void setSpaceCred(MultipartFile spaceCred) {
		try {
			this.imageContent = spaceCred.getBytes();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void setImageContent(byte[] imageContent) {
		this.imageContent = imageContent;
	}
	
	
	
	
	
}

