package com.npci.loanapplication.Loan.Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.loanapplication.Loan.Application.model.Loan;
import com.npci.loanapplication.Loan.Application.service.CustomerService;
import com.npci.loanapplication.Loan.Application.service.LoanService;

@RestController
@RequestMapping("/loan")
@CrossOrigin("*")
public class LoanController {

    
	@Autowired
	LoanService loanService;

   @GetMapping("/getAllLoans")
    public List<Loan> getAllLoans() {
	   return loanService.getAllLoans();
    }

}
