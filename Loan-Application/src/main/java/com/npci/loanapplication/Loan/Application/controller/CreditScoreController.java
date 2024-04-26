package com.npci.loanapplication.Loan.Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.loanapplication.Loan.Application.model.CreditScore;
import com.npci.loanapplication.Loan.Application.model.Loan;
import com.npci.loanapplication.Loan.Application.service.CreditScoreService;

@RestController
@RequestMapping("/creditScore")
@CrossOrigin("*")
public class CreditScoreController {
	
	
	@Autowired
	CreditScoreService creditScoreService;
	
	  @GetMapping("/getCreditScoreByPanNumber/{panNumber}")
	    public CreditScore getCreditScoreByPanNumber(@PathVariable String panNumber) {
		   return creditScoreService.getCreditScoreByPanNumber(panNumber).orElseThrow();
	    }

}
