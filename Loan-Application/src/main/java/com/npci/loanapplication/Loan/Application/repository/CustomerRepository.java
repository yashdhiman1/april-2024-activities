package com.npci.loanapplication.Loan.Application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npci.loanapplication.Loan.Application.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
	
	Customer findByEmailIdAndPassword(String emailId, String password);
	Optional<Customer> findByEmailId(String emailId);

    boolean existsByEmailId(String emailId);

	
}
