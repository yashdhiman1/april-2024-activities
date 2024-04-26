package com.npci.loanapplication.Loan.Application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.loanapplication.Loan.Application.dto.EmployeeLoginResponse;
import com.npci.loanapplication.Loan.Application.dto.LoginResponse;
import com.npci.loanapplication.Loan.Application.model.Customer;
import com.npci.loanapplication.Loan.Application.model.Employee;
import com.npci.loanapplication.Loan.Application.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee registerEmployee(Employee employee) {
		// Check if customer data is valid
		if (employee == null || !isEmployeeDataValid(employee)) {
			throw new IllegalArgumentException("Invalid employee data");
		}

		// Check if the email is already registered
		if (employeeRepository.existsByEmailId(employee.getEmailId())) {
			throw new IllegalArgumentException("Email is already registered");
		}

		// Save the customer to the database
		return employeeRepository.save(employee);
	}

	public EmployeeLoginResponse loginEmployee(String email, String password) {

		EmployeeLoginResponse response = new EmployeeLoginResponse();
		// Find customer by email and password
		Optional<Employee> employee = employeeRepository.findByEmailId(email);

		if (employee.isEmpty()) {
			response.setStatusCode(407);
			response.setMessage("employee does not exist");
			return response;
		}

		if (!employee.get().getPassword().equals(password)) {
			response.setStatusCode(408);
			response.setMessage("wrong password");
			return response;
		}

		response.setStatusCode(200);
		response.setMessage("login successful");
		response.setEmployee (employee.get());
		return response;
	}

	private boolean isEmployeeDataValid(Employee employee) {
		// Implement validation logic for customer data
		// For example, checking if required fields are not null
		return employee.getEmployeeName() != null &&employee.getEmailId() != null
				&& employee.getPassword() != null;
	}

}
