package com.customexception.customexceptionapp.Bouncer;

import  com.customexception.customexceptionapp.exception.PubException;

public class Bouncer {
	
	public void checkAge(int age) throws PubException{
		
		if(age<18) {
			
			PubException exception= new PubException();
			throw exception;
		}
		else {
			System.out.println("please enter.. Enjoy");
		}
	}

}
