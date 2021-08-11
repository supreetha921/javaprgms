package com.customexception.customexceptionapp.exception;

//Custom checked Exception
public class PubException extends Exception {
  
	public String getMessage() {
		return "you are too young to enter the PUB";
	}
}
