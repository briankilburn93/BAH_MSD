package com.bah.msd.mcc.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.mcc.pojos.Customers;

@RestController
@RequestMapping("/customers")
public class CustomersAPI {
	
	@GetMapping
	public List<Customers> getCustomers() {
		
		List<Customers> customerList = new ArrayList<Customers>();
		
		Customers customerTest = new Customers();
		customerTest.setEmail("email@email.com");
		customerTest.setId(1);
		customerTest.setName("TestName");
		customerTest.setPassword("password");

		customerList.add(customerTest);
		
		return customerList;
	}
	
	@GetMapping("/{id}")
	public Customers getCustomerById(@PathVariable("id") int id) {
		
		Customers customerTest = new Customers();
		customerTest.setEmail("email@email.com");
		customerTest.setId(1);
		customerTest.setName("TestName");
		customerTest.setPassword("password");
		
		if(customerTest.getId() == id) {
			return customerTest;
		} else {
			return null;
		}
	}
	
}
