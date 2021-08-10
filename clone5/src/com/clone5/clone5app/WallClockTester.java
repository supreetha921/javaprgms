package com.clone5.clone5app;

import com.clone5.clone5app.wallclock.WallClock;

public class WallClockTester {
	public static void main(String[] args) {
		WallClock clock=new WallClock();
		clock.setName("Titan");
		clock.setPrice(2000);
		clock.setType("Analog Clock");
		
		System.out.println(clock.getName()+" "+clock.getPrice()+" "+clock.getType());
		
		try {
			WallClock wc=(WallClock) clock.clone();
			wc.setPrice(2500);
			wc.setType("Digital Clock");
			

			System.out.println(wc.getName()+" "+wc.getPrice()+" "+wc.getType());
			
		}
			
			catch(CloneNotSupportedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}

