package com.abst.abstapp;
import com.abst.abstapp.abstraction.AtmMachine;
import com.abst.abstapp.abstraction.Sbi;
import com.abst.abstapp.abstraction.SbiAtm;


public class AtmUtil {
	public static void main(String[]args) {
		AtmMachine machine=new AtmMachine();
		SbiAtm sbi=new SbiAtm();
		
		machine.slot(sbi);
		Sbi s=new SbiAtm();
		s.createAccount();
	}

}
