package com.npci.loanapplication.Loan.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.loanapplication.Loan.Application.model.CreditScore;

public interface CreditScoreRepository extends JpaRepository<CreditScore, String> {

}
