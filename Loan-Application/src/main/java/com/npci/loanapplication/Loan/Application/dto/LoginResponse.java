package com.npci.loanapplication.Loan.Application.dto;

import com.npci.loanapplication.Loan.Application.model.Customer;

public class LoginResponse {
	
	int statusCode;
	String message;
	Customer customer;
	
	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginResponse(int statusCode, String message, Customer customer) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.customer = customer;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	 
	 
	 
	 

}
