package com.atm.atmapp.machine;
import com.atm.atmapp.exception.ATMException;


public class Machine {
	
	public void withDraw(int amt) {
		
		if(amt > 20000 || amt <100 || amt % 100 != 0) {
			throw new ATMException();
		}else {
			System.out.println("Collect the cash");
		}
	}

}
