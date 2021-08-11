package com.customexception.customexceptionapp.exception;

import  com.customexception.customexceptionapp.exception.PubException;
import com.customexception.customexceptionapp.Bouncer.Bouncer;

public class PubTester {
	
	public static void main(String []args) {
		
		Bouncer bouncer=new Bouncer();
		try {
			bouncer.checkAge(23);
		}catch(PubException e) {
			//TODO Auto-generated catch block
			
		}
	}

}
