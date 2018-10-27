package com.demo.demoxml.customerBilling;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class CustomerBillingService implements ICustomerBillingService{
	List<CustomerBilling> customersbill = new ArrayList<CustomerBilling>();
	public CustomerBillingService() {
		customersbill.add(new CustomerBilling(1, "Avik", "ElectronicCity",500));	
		customersbill.add(new CustomerBilling(2, "Abhinesh", "Madiwalla",600));
		customersbill.add(new CustomerBilling(3, "Rajinikanth", "Sarjapura",7894));
		customersbill.add(new CustomerBilling(4, "Siddappa", "Sarjapur",8745));
		customersbill.add(new CustomerBilling(5, "Amit", "Jayanagar",56252 ));
		customersbill.add(new CustomerBilling(6, "Anand", "Mahadevapura",5445));
		customersbill.add(new CustomerBilling(7, "Vikram", "SilkBoard",485));
		customersbill.add(new CustomerBilling(8, "Karthik", "Jayanagar",48529));
		customersbill.add(new CustomerBilling(9, "Prince", "MGRoad",789));
		customersbill.add(new CustomerBilling(10, "Nandish", "RajajiNagara",745));
		customersbill.add(new CustomerBilling(11, "Babu", "Kormangalla",500));	
		customersbill.add(new CustomerBilling(12, "Ayan", "Madiwalla",900));
		customersbill.add(new CustomerBilling(13, "Vamsi", "Agara",1200));
		customersbill.add(new CustomerBilling(14, "David", "VijyaNagar",784));
		customersbill.add(new CustomerBilling(15, "Vijya", "Banashankri",1200 ));
	}
	
	@Override
	public List<CustomerBilling> getAll() {
		return customersbill;
	}

	@Override
	public CustomerBilling getById(int id) {
		CustomerBilling custobill = new CustomerBilling();
		
		for (CustomerBilling customersbill : customersbill) {
			if(id == customersbill.getBill_id()) {
			custobill =	customersbill;
			}
		}
		
		return custobill;
	}



}
