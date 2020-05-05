package com.example.demo.handlers;

import java.io.IOException;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.demo.models.BillingInfo;
import com.example.demo.models.DBFile;
import com.example.demo.models.PersonalInfo;
import com.example.demo.models.RegisterModel;
import com.example.demo.models.StoragePicture;
import com.todo.repository.CommunityStorageApplicationRepo;
import com.todo.restmodels.CommunitySpaces;

@Component
public class RegisterHandler {
	
	@Autowired
	CommunityStorageApplicationRepo communityrepo;

	public RegisterModel init() {
		return new RegisterModel();
	}

	public void addPersonalInfo(RegisterModel registerModel, PersonalInfo personalInfo) throws IOException {
		
		registerModel.setPersonalInfo(personalInfo);
	}

	public void addBillingInfo(RegisterModel registerModel, BillingInfo billingInfo) throws IOException {
		registerModel.setBillingInfo(billingInfo);
	}
	
	public void addPictureInfo(RegisterModel registerModel, StoragePicture storagepictures)  throws IOException {
		registerModel.setStoragepicture(storagepictures);
	}

	
	

	public String saveAll(RegisterModel registerModel, MessageContext error) {
		String transitionValue = "success";

		CommunitySpaces comspace= new CommunitySpaces();
		comspace.setFullname(registerModel.getPersonalInfo().getFullname());
		comspace.setEmail(registerModel.getPersonalInfo().getEmail());
		comspace.setPhone(registerModel.getPersonalInfo().getPhone());
		comspace.setValidID(registerModel.getPersonalInfo().getValidID());
		comspace.setAddress(registerModel.getBillingInfo().getAddress());
		comspace.setSpaceType(registerModel.getBillingInfo().getSpaceType());
		comspace.setState(registerModel.getBillingInfo().getState());
		comspace.setOtherDetails(registerModel.getBillingInfo().getOtherDetails());
		comspace.setSpaceSize(registerModel.getBillingInfo().getSpaceSize());
		comspace.setSpaceCredentials(registerModel.getBillingInfo().getSpaceCredentials());
		comspace.setImageurl1(registerModel.getStoragepicture().getImageurl1());
		comspace.setImageurl2(registerModel.getStoragepicture().getImageurl2());
		comspace.setImageurl3(registerModel.getStoragepicture().getImageurl3());
		comspace.setImageurl4(registerModel.getStoragepicture().getImageurl4());
		comspace.setImageurl5(registerModel.getStoragepicture().getImageurl5());
		
		communityrepo.save(comspace);
		
		
		return transitionValue;
	}

	public String validatePersonalInfo(PersonalInfo personalInfo, MessageContext error) {
		String transitionValue = "success";
		

       
		return transitionValue;
	}
}
