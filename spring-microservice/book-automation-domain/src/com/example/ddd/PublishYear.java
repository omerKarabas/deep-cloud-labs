package com.example.ddd;

import java.util.Objects;

public class PublishYear {

	private int publishYear;

	public static PublishYear of(int publishYear) {
		Objects.requireNonNull(publishYear);
		return new PublishYear(publishYear);
	}
	public PublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublishYear other = (PublishYear) obj;
		return publishYear == other.publishYear;
	}

	@Override
	public String toString() {
		return "PublishYear [publishYear=" + publishYear + "]";
	}
	
}
