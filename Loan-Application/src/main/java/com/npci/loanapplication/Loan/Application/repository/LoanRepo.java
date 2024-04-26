package com.npci.loanapplication.Loan.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.loanapplication.Loan.Application.model.Loan;

public interface LoanRepo extends JpaRepository<Loan, Long> {

}
