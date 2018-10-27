package com.demo.demoxml.customerBilling;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api/bills")
public class CustomerBillingController {
	
	// Logger initialization
	final private static Logger logger = LoggerFactory.getLogger(CustomerBillingController.class);
	
	@Autowired
	ICustomerBillingService customersbill;
	
	@GetMapping( produces =MediaType.APPLICATION_XML_VALUE)
	public List<CustomerBilling> getAllCustomers(){
		return customersbill.getAll();
	}
	
	@GetMapping(value= "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<CustomerBilling> getById(@PathVariable Integer id){
		return ResponseEntity.ok().body(customersbill.getById(id));
	} 
			

}
