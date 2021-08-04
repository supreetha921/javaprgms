
package com.temples.templesapp;
public class TemplesTester {

	public static void main(String a[])
	{
	  Temples temple=new Temples();
	  temple.name="Shri Ranganathaswamy Temple";
	  temple.location="Srirangapatna";
	  temple.darshantiming="7 PM";
	  temple.establishedYear="984 A.D";
	  System.out.println( temple.name+" "+ temple.location +" "+ temple.darshantiming +" "+ temple.establishedYear);
	 
	  
	  temple.pooja();
	 
	}
	}
