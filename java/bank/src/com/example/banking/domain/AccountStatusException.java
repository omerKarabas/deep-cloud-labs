package com.example.banking.domain;

@SuppressWarnings("serial")
public class AccountStatusException extends Exception {

	private final AccountStatus statusState;
	
	public AccountStatusException(String message, AccountStatus statusState) {
		super(message);
		this.statusState = statusState;
	}

	public AccountStatus getStatusState() {
		return statusState;
	}

}
