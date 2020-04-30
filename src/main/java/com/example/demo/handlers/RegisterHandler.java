package com.example.demo.handlers;

import java.io.IOException;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.demo.models.BillingInfo;
import com.example.demo.models.DBFile;
import com.example.demo.models.PersonalInfo;
import com.example.demo.models.RegisterModel;

@Component
public class RegisterHandler {

	public RegisterModel init() {
		return new RegisterModel();
	}

	public void addPersonalInfo(RegisterModel registerModel, PersonalInfo personalInfo) throws IOException {
		
		registerModel.setPersonalInfo(personalInfo);
	}

	public void addBillingInfo(RegisterModel registerModel, BillingInfo billingInfo) {
		registerModel.setBillingInfo(billingInfo);
	}

	public String saveAll(RegisterModel registerModel, MessageContext error) {
		String transitionValue = "success";

		// XXX Save model in database or somewhere else...
		error.addMessage(new MessageBuilder(). //
				error() //
				.source("registration") //
				.defaultText( //
						String.format("Couldn't register user with username: %s!",
								registerModel.getPersonalInfo().getFullname())) //
				.build());
		transitionValue = "failure";

		return transitionValue;
	}

	public String validatePersonalInfo(PersonalInfo personalInfo, MessageContext error) {
		String transitionValue = "success";


       
		return transitionValue;
	}
}
