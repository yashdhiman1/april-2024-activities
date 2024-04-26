package com.npci.loanapplication.Loan.Application.model;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_application_table", schema = "training")
public class LoanApplication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private Long applicationId;
    
    @Column(name = "customer_id")
    private Long customerId;
    
    @Column(name = "loan_id")
    private Long loanId;
    
    @Column(name = "status")
    private String status;
    
    @ManyToOne()
    @JoinColumn(name = "customer",referencedColumnName = "customer_id",insertable=false, updatable=false)
    private Customer customer;
    
    @ManyToOne()
    @JoinColumn(name = "loan",referencedColumnName = "loan_id",insertable=false, updatable=false)
    private Loan loan;

	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanApplication(Long applicationId, Long customerId, Long loanId, String status) {
		super();
		this.applicationId = applicationId;
		this.customerId = customerId;
		this.loanId = loanId;
		this.status = status;
	}
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
}