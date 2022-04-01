package com.example.ddd;

import com.example.ddd.annotations.Aggregate;

@Aggregate(id = "identity")
public class Grad {
	private Identity identity;
	private FullName fullName;
	private BirthDate birthDate;
	private Photo photo;
	private Contact contact;
	private Status status;
	private PaymentStatus paymentStatus;

}
