package com.atm.atmapp.exception;

//custom un-checked exception
public class ATMException extends RuntimeException {

	public String getMessage() {
		return "Enter valid amount";
	}

}
