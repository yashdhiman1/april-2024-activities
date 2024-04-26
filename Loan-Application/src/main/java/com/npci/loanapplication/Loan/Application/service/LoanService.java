package com.npci.loanapplication.Loan.Application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.loanapplication.Loan.Application.model.Loan;
import com.npci.loanapplication.Loan.Application.repository.LoanRepo;

@Service
public class LoanService {
	
	@Autowired
	LoanRepo loanRepo;
	
	public List<Loan> getAllLoans(){
		return loanRepo.findAll();
	}

}
