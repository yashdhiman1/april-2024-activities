package com.npci.loanapplication.Loan.Application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.loanapplication.Loan.Application.dto.LoginResponse;
import com.npci.loanapplication.Loan.Application.model.Customer;
import com.npci.loanapplication.Loan.Application.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer registerCustomer(Customer customer) {
		// Check if customer data is valid
		if (customer == null || !isCustomerDataValid(customer)) {
			throw new IllegalArgumentException("Invalid customer data");
		}

		// Check if the email is already registered
		if (customerRepository.existsByEmailId(customer.getEmailId())) {
			throw new IllegalArgumentException("Email is already registered");
		}

		// Save the customer to the database
		return customerRepository.save(customer);
	}

	public LoginResponse loginCustomer(String email, String password) {

		LoginResponse response = new LoginResponse();
		// Find customer by email and password
		Optional<Customer> customer = customerRepository.findByEmailId(email);

		if (customer.isEmpty()) {
			response.setStatusCode(407);
			response.setMessage("customer does not exist");
			return response;
		}

		if (!customer.get().getPassword().equals(password)) {
			response.setStatusCode(408);
			response.setMessage("wrong password");
			return response;
		}

		response.setStatusCode(200);
		response.setMessage("login successful");
		response.setCustomer(customer.get());
		return response;
	}

	private boolean isCustomerDataValid(Customer customer) {
		// Implement validation logic for customer data
		// For example, checking if required fields are not null
		return customer.getFirstName() != null && customer.getLastName() != null && customer.getEmailId() != null
				&& customer.getPassword() != null && customer.getPan() != null && customer.getPhone() != null;
	}
}
