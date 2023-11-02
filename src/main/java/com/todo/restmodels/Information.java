package com.todo.restmodels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Information implements Serializable {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = -3319563461851393623L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int StoreId;

    
	
	String title;
    String address;
    String locality;
    String postCode;
    String telephone;
    String image;
    String email;
    String link;
    
    
    @OneToOne(mappedBy = "information")
    private StorageSpace storagespace;
	
	



	public Information() {
		
	}




	@JsonProperty("Title")
	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}




	@JsonProperty("Address")
	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}




	@JsonProperty("Locality")
	public String getLocality() {
		return locality;
	}





	public void setLocality(String locality) {
		this.locality = locality;
	}




	@JsonProperty("Postcode")
	public String getPostCode() {
		return postCode;
	}





	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}




	@JsonProperty("Telephone")
	public String getTelephone() {
		return telephone;
	}





	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	@JsonProperty("Image")
	public String getImage() {
		return image;
	}





	public void setImage(String image) {
		this.image = image;
	}




	@JsonProperty("Email")
	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}




	@JsonProperty("Link")
	public String getLink() {
		return link;
	}





	public void setLink(String link) {
		this.link = link;
	}




	@JsonProperty("StoreId")
	public int getStoreId() {
		return StoreId;
	}








	
	


	



	
	
	
	
	

}
