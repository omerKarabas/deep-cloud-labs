package com.example.banking.domain;

import java.time.LocalDate;

public abstract class Account {

	private String iban;
	private double balance;
	private LocalDate createDate= LocalDate.now();
	private AccountStatus status = AccountStatus.ACTIVE;
	private AccountType accountType = AccountType.NORMAL;
	
		
	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Account(String iban, double balance, LocalDate createDate) {
		this.iban = iban;
		this.balance = balance;
		this.createDate = createDate;
	}

	public String getIban() {
		return iban;
	}

	public double getBalance() {
		return balance;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}
	
	public double deposit(double amount) 
			throws AccountStatusException {
	
		if(accountStatus(status))
		if(amount<=0.0)
			throw new IllegalArgumentException
					("Amount must be postive.");
		this.balance+=amount;
		return balance;
	}
	
	public double withdraw(double amount,AccountStatus status) 
			throws InsufficientBalanceException, AccountStatusException {
	
		if(accountStatus(status))
		if (amount<= 0.0)
			throw new IllegalArgumentException("Amount must be postive.");
		if(amount> balance)
			throw new InsufficientBalanceException(
					"Your balance does not cover your expenses.",
					amount-balance);
		this.balance-=amount;
		return balance;
		}
	
	public boolean accountStatus (AccountStatus status) 
			throws AccountStatusException {
		
		var isBlocked=status.BLOCKED;
		var isClosed=status.CLOSED;
		
		if(status==isBlocked)
			throw new AccountStatusException
						("Account status is blocked.",status);
		if(status==isClosed)
			throw new AccountStatusException
						("Account status is closed.",status);
		return true;
		
	}

	@Override
	public String toString() {
		return "Account [iban=" + iban + ", balance=" + balance + ", createDate=" + createDate + ", status=" + status
				+ "]";
	}
	
}
