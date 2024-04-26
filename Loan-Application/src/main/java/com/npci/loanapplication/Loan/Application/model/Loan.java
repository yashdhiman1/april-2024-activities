package com.npci.loanapplication.Loan.Application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "loan_table", schema = "training")
public class Loan {

    @Id
    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "loan_type")
    private String loanType;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(Long loanId, String loanType) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
    
    
}