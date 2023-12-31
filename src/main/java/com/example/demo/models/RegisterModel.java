package com.example.demo.models;

import java.io.Serializable;

public class RegisterModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private PersonalInfo personalInfo;
	private BillingInfo billingInfo;
	private StoragePicture storagepicture;

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public BillingInfo getBillingInfo() {
		return billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}

	public StoragePicture getStoragepicture() {
		return storagepicture;
	}

	public void setStoragepicture(StoragePicture storagepicture) {
		this.storagepicture = storagepicture;
	}
	
	
	
}