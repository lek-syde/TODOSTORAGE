package com.example.demo.models;

import java.io.Serializable;

public class Booking implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int storeid;
	int size;
	
	String firstname;
	String lastname;
	String email;
	String phone;
	
	String storagename;
	
	
	
	
	
	
	
	
	
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Booking() {
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getStoragename() {
		return storagename;
	}
	public void setStoragename(String storagename) {
		this.storagename = storagename;
	}
	
	
	
	
	
	
	
	
	
	

}
