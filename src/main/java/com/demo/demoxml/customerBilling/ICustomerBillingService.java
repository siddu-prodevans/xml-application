package com.demo.demoxml.customerBilling;

import java.util.List;


public interface ICustomerBillingService {
	public List<CustomerBilling> getAll();

	CustomerBilling getById(int id);

}
