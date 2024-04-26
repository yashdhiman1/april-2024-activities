package com.npci.loanapplication.Loan.Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.npci.loanapplication.Loan.Application.model.LoanApplication;
import com.npci.loanapplication.Loan.Application.service.LoanApplicationService;

@RestController
@RequestMapping("/loanApplication")
@CrossOrigin("*")
public class LoanApplicationController {
	
	@Autowired
	LoanApplicationService loanApplicationService;
	
	
	@PostMapping("/createLoanApplication")
	LoanApplication createLoanApplication(@RequestBody LoanApplication loanApplication) {
		return loanApplicationService.createLoanApplication(loanApplication);
	}
	
	
	@GetMapping("/findByCustomerId/{customerId}")
	public List<LoanApplication> findByCustomerId(@PathVariable Long customerId) {
		 return loanApplicationService.findByCustomerId(customerId);
	 }
	
	@GetMapping("/findAll")
	public List<LoanApplication> findAll() {
		 return loanApplicationService.findAll();
	 }
	
	@PutMapping("/updateStatus/{loanApplicationId}/{status}")
	public boolean updateStatus(@PathVariable Long loanApplicationId,@PathVariable String status) {
		return loanApplicationService.updateStatus(loanApplicationId, status);
	}

}
