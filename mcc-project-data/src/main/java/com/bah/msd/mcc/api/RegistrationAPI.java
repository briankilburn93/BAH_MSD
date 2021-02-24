package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.pojos.Registration;

@RestController
@RequestMapping("/registrations")
public class RegistrationAPI {
	
	List<Registration> registrationList = new ArrayList<Registration>();
	
	public RegistrationAPI() {
		
	Registration r1 = new Registration(1L, "customer Name", "event name", new Date(), "notes");
	this.registrationList.add(r1);
	}
	
	@GetMapping
	public List<Registration> getAllRegistrations() {
		
		return this.getListOfRegistrations();
	}
	
	@GetMapping("/{registrationId}")
	public Registration getRegistration(@PathVariable ("registrationId") Long id) {
		Registration myRegistration = null;
		for(Registration registration : registrationList) {
			if(registration.getId() == id) {
				myRegistration = registration;
			}
		}
		return myRegistration;
	}
	
	public List<Registration> getListOfRegistrations() {
		return registrationList;
	}
	
	public void setListOfRegistrations(List<Registration> listOfRegistrations) {
		this.registrationList = listOfRegistrations;
	}
	
	
	
}
