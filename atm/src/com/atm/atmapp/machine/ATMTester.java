package com.atm.atmapp.machine;
import java.util.Scanner;
import com.atm.atmapp.exception.ATMException;
import com.atm.atmapp.machine.Machine;

public class ATMTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		Machine machine = new Machine();
		try {
			machine.withDraw(sc.nextInt());
		} catch (ATMException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}

		}
	}

}
