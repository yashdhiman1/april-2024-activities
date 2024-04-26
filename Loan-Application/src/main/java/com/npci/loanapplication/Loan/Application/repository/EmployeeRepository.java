package com.npci.loanapplication.Loan.Application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.loanapplication.Loan.Application.model.Customer;
import com.npci.loanapplication.Loan.Application.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	Optional<Employee> findByEmailId(String emailId);
	 boolean existsByEmailId(String emailId);
}
