package com.clone2.clone2app.oven;

public class Oven implements Cloneable {
	private String name;
	private int Duration;
	private String Baking;
	
	public String getName()  {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getDuration() {
		return Duration;
		
	}
	public void setDuration(int Duration) {
		this.Duration=Duration;
	}
	public String getBaking() {
		return Baking;
	}
	public void setBaking(String Baking) {
		this.Baking=Baking;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		//TODO Auto-generated method stub
		return super.clone();
	}
	
}
