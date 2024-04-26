package com.npci.loanapplication.Loan.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.loanapplication.Loan.Application.model.LoanApplication;
import com.npci.loanapplication.Loan.Application.repository.LoanApplicationRepo;

@Service
public class LoanApplicationService {
	
	@Autowired
	LoanApplicationRepo loanApplicationRepo;
	
	
	 
	public LoanApplication createLoanApplication(LoanApplication loanApplication) {
		 return loanApplicationRepo.save(loanApplication);
	 }
	 
	public List<LoanApplication> findByCustomerId(Long customerId) {
		 return loanApplicationRepo.findByCustomerId(customerId);
	 }
	
	public List<LoanApplication> findAll() {
		 return loanApplicationRepo.findAll();
	 }
	
	public boolean updateStatus(Long loanApplicationId, String status) {
		try {
			 Optional<LoanApplication> appl = loanApplicationRepo.findById(loanApplicationId);
			 if(appl.isEmpty()) {
				 return false;
			 }
			 appl.get().setStatus(status);
			 loanApplicationRepo.save(appl.get());
			 return true;
		}
		catch(Exception e) {
			return false;
		}
	 }
	 
	 

	

}
