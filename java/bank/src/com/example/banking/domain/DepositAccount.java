package com.example.banking.domain;

import java.time.LocalDate;
import java.util.Date;

public class DepositAccount extends Account {

	private double interest;
	private Date interestFinishDate = new Date();
	private AccountType accountType = AccountType.DEPOSIT;
	
	public DepositAccount(String iban,double balance, 
									LocalDate createDate, 
									double interest, 
									Date interestFinishDate) {
		
		super(iban, balance, createDate);
		this.interest = interest;
		this.interestFinishDate = interestFinishDate;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public Date getInterestFinishDate() {
		return interestFinishDate;
	}

	public void setInterestFinishDate(Date interestFinishDate) {
		this.interestFinishDate = interestFinishDate;
	}

	public double depositWithInterest(double amount,double interest) {
		super.deposit(amount).
	}
	
}
