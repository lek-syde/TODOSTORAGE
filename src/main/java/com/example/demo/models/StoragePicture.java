package com.example.demo.models;


import java.io.Serializable;

import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

public class StoragePicture implements Serializable {

	private static final long serialVersionUID = 1L;


	
	@NotBlank(message = "Please upload your passport photograph")
	private String imageurl1;
	
	
	
	@NotBlank(message = "Please upload your passport photograph")
	private String imageurl2;
	
	
	
	
	private String imageurl3;
	
	
	
	private String imageurl4;
	
	
	
	private String imageurl5;



	


	public String getImageurl1() {
		return imageurl1;
	}



	public void setImageurl1(String imageurl1) {
		this.imageurl1 = imageurl1;
	}



	public String getImageurl2() {
		return imageurl2;
	}



	public void setImageurl2(String imageurl2) {
		this.imageurl2 = imageurl2;
	}



	public String getImageurl3() {
		return imageurl3;
	}



	public void setImageurl3(String imageurl3) {
		this.imageurl3 = imageurl3;
	}



	public String getImageurl4() {
		return imageurl4;
	}



	public void setImageurl4(String imageurl4) {
		this.imageurl4 = imageurl4;
	}



	public String getImageurl5() {
		return imageurl5;
	}



	public void setImageurl5(String imageurl5) {
		this.imageurl5 = imageurl5;
	}
	

	
	
	

	
	
	

	
	
	
	
	
	



	
	
	
	
	
	
	

	
	
	

	
}
