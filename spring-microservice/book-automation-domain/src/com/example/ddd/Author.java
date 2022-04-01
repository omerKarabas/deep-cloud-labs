package com.example.ddd;

import java.util.Objects;

import com.example.ddd.annotations.ValueObject;

@ValueObject
public class Author {

	private final String firstName;
	private final String lastName;
	
	public static Author of(String firstName, String lastName) {
		Objects.requireNonNull(firstName);
		Objects.requireNonNull(lastName);
		if (!firstName.matches("^[a-z]{3,}$"))
			throw new IllegalArgumentException("Firstname must have at least 3 alphabet chars.");
		if (!lastName.matches("^[a-z]{2,}$"))
			throw new IllegalArgumentException("Lastname must have at least 2 alphabet chars.");
		return new Author(firstName, lastName);
	}
	

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}


	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	

}
