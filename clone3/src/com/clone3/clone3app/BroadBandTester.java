package com.clone3.clone3app;
import com.clone3.clone3app.broadband.BroadBand;

public class BroadBandTester {
	
	private String name;
	private int price;
	private String speed;
	
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public String getSpeed() {
		return speed;
	}
	
	public void setSpeed(String speed) {
		this.speed=speed;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
		
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
