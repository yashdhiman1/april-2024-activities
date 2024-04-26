package com.npci.loanapplication.Loan.Application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.loanapplication.Loan.Application.model.CreditScore;
import com.npci.loanapplication.Loan.Application.repository.CreditScoreRepository;

@Service
public class CreditScoreService {
	
	@Autowired
	CreditScoreRepository creditScoreRepository;
	
	public Optional<CreditScore> getCreditScoreByPanNumber(String panNumber)
	{
		return creditScoreRepository.findById(panNumber);
	}
}
