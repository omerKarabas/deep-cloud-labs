package com.example.ddd;

import java.util.Objects;

import com.example.ddd.annotations.ValueObject;
@ValueObject
public class PublishingHouse {
	
	private String publishingHouse;
	
	public static PublishingHouse of(String publishingHouse) {
		Objects.requireNonNull(publishingHouse);
		if (!publishingHouse.matches("^[a-z]{1,}$"))
			throw new IllegalArgumentException("Publishing house name must have at least 1 alphabet chars.");
		return new PublishingHouse(publishingHouse);
	}

    public PublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	@Override
	public int hashCode() {
		return Objects.hash(publishingHouse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublishingHouse other = (PublishingHouse) obj;
		return Objects.equals(publishingHouse, other.publishingHouse);
	}

	@Override
	public String toString() {
		return "PublishingHouse [publishingHouse=" + publishingHouse + "]";
	}
	
}
