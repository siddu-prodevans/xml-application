package com.demo.demoxml.customerBilling;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerBilling {
	
	public CustomerBilling() {
		super();
	}

	private int bill_id;

	private String biller_name;

	private String biller_address;

	private double bill_amount;

	public CustomerBilling(int bill_id, String biller_name, String biller_address, double bill_amount) {
		super();
		this.bill_id = bill_id;
		this.biller_name = biller_name;
		this.biller_address = biller_address;
		this.bill_amount = bill_amount;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public String getBiller_name() {
		return biller_name;
	}

	public void setBiller_name(String biller_name) {
		this.biller_name = biller_name;
	}

	public String getBiller_address() {
		return biller_address;
	}

	public void setBiller_address(String biller_address) {
		this.biller_address = biller_address;
	}

	public double getBill_amount() {
		return bill_amount;
	}

	public void setBill_amount(double bill_amount) {
		this.bill_amount = bill_amount;
	}

	@Override
	public String toString() {
		return "CustomerBilling [bill_id=" + bill_id + ", biller_name=" + biller_name + ", biller_address="
				+ biller_address + ", bill_amount=" + bill_amount + "]";
	}

}
