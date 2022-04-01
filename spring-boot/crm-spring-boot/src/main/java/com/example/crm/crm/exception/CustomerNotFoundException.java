package com.example.crm.crm.exception;

public class CustomerNotFoundException extends RuntimeException {
 private final int i18nId;
 private final String debugId;

 public CustomerNotFoundException(int i18nId, String debugId) {
	super();
	this.i18nId = i18nId;
	this.debugId = debugId;
}

public int getI18nId() {
	return i18nId;
}

public String getDebugId() {
	return debugId;
}
 
 
 
}
