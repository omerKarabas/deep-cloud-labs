package com.example.ddd;

import com.example.ddd.annotations.Aggregate;

@Aggregate(id = "identity")
public class user {
	
	private Identity identity;
	private Fullname fullname;
	private BirthDate birthDate;
	private Photo photo;
	private IBAN iban;
	private SmartCardID smartCardID;
	//private UserType userType;
	
}
