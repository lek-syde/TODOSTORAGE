package com.todo.restmodels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class CommunitySpaces implements Serializable {
	
	   /**
		 * s
		 */
		private static final long serialVersionUID = -3319563461851393623L;
		
		/**
		 * personnal details
		 */

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int StoreId;
		
		private String fullname;
		
		private String phone;
		
		private String email;
	
		private String imageurl;
	
		private String validID;
		
		
		/**
		 * space details
		 */
		
		
		
	
		private String address;
		
		private String spaceType;
		
		private String state;
		private String otherDetails;
		
		private int spaceSize;
		
		private String spaceCredentials;
		
		
		
		/**
		 * space pictures
		 */
		
		
		
		private String imageurl1;
	
		private String imageurl2;
		private String imageurl3;
		private String imageurl4;
		private String imageurl5;
		
		
		
		
		
		public int getStoreId() {
			return StoreId;
		}
		public void setStoreId(int storeId) {
			StoreId = storeId;
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
		public String getOtherDetails() {
			return otherDetails;
		}
		public void setOtherDetails(String otherDetails) {
			this.otherDetails = otherDetails;
		}
		public int getSpaceSize() {
			return spaceSize;
		}
		public void setSpaceSize(int spaceSize) {
			this.spaceSize = spaceSize;
		}
		public String getSpaceCredentials() {
			return spaceCredentials;
		}
		public void setSpaceCredentials(String spaceCredentials) {
			this.spaceCredentials = spaceCredentials;
		}
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
		public CommunitySpaces() {
			
		}
		
		
		
		
		
		
		

}
