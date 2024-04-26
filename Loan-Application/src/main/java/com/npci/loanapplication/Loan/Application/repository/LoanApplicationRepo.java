package com.npci.loanapplication.Loan.Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.loanapplication.Loan.Application.model.LoanApplication;



public interface LoanApplicationRepo  extends JpaRepository<LoanApplication, Long>{

	List<LoanApplication> findByCustomerId(Long customerId);
}
