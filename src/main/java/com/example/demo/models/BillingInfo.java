package com.example.demo.models;

import java.io.Serializable;
import java.util.Base64;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;


public class BillingInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String address;
	
	@NotBlank
	private String spaceType;
	
	@NotBlank
	private String state;
	
	

	private String otherDetails;
	
	@NotNull
    @Min(18)
	private int spaceSize;
	
	
	@NotBlank
	private String spaceCredentials;
	
	

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



	

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public String getSpaceCredentials() {
		return spaceCredentials;
	}

	public void setSpaceCredentials(String spaceCredentials) {
		this.spaceCredentials = spaceCredentials;
	}


	


	
	
	
	
	
}

