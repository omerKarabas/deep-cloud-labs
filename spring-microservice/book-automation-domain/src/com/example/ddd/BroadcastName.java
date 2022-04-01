package com.example.ddd;

import java.util.Objects;

import com.example.ddd.annotations.ValueObject;
@ValueObject
public class BroadcastName {
	
	private String broadcastName;

	public static BroadcastName of(String broadcastName) {
		Objects.requireNonNull(broadcastName);
		if (!broadcastName.matches("^[a-z]{1,}$"))
			throw new IllegalArgumentException("Broadcast name must have at least 1 alphabet chars.");
		return new BroadcastName(broadcastName);
	}
	public String getBroadcastName() {
		return broadcastName;
	}

	public void setBroadcastName(String broadcastName) {
		this.broadcastName = broadcastName;
	}

	public BroadcastName(String broadcastName) {
		super();
		this.broadcastName = broadcastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(broadcastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BroadcastName other = (BroadcastName) obj;
		return Objects.equals(broadcastName, other.broadcastName);
	}

	@Override
	public String toString() {
		return "BroadcastName [broadcastName=" + broadcastName + "]";
	}
	
	
}
