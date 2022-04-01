package com.example.ddd;

import java.util.Objects;

public class ISBN {

	private String isbn;

	public static ISBN of(String isbn) {
		Objects.requireNonNull(isbn);
		return new ISBN(isbn);
		
	} 
	public ISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ISBN other = (ISBN) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "ISBN [isbn=" + isbn + "]";
	}
	
}
