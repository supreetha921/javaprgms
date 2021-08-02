package com.maxnumber.maxnumberapp;

public class MaxNumber {
	
	public static void main(String[] args) {

	      int num1 = 10, num2 = 30, num3 = 15;

	      if( num1 >= num2 && num1 >= num3)
	          System.out.println(num1+" is the maximum Number");

	      else if (num2 >= num1 && num2 >= num3)
	          System.out.println(num2+" is the maximum Number");

	      else
	          System.out.println(num3+" is the maximum Number");
	  }

}
