package com.clone2.clone2app;

import com.clone2.clone2app.oven.Oven;

public class OvenTester {
	
	
	public static void main(String[] args) {
		Oven oven=new Oven();
		oven.setName("Philips");
		oven.setDuration(120);
		oven.setBaking("cupcake");
		
		System.out.println(oven.getName()+" "+oven.getDuration()+" "+oven.getBaking());
		
		try {
			Oven oven2=(Oven) oven.clone();
			oven2.setName("Samsung");
			
			System.out.println(oven2.getName()+" "+oven2.getDuration()+" "+oven2.getBaking());
		}
			
			catch(CloneNotSupportedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	

}
