package com.npci.loanapplication.Loan.Application.dto;

import com.npci.loanapplication.Loan.Application.model.Customer;
import com.npci.loanapplication.Loan.Application.model.Employee;

public class EmployeeLoginResponse {
	
	int statusCode;
	String message;
	Employee employee;
	
	public EmployeeLoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeLoginResponse(int statusCode, String message, Employee customer) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.employee = customer;
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	 
	 
	 
	 

}
