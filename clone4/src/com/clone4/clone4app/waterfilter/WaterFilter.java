package com.clone4.clone4app.waterfilter;

public class WaterFilter implements Cloneable {
	
	
	private String name;
	private int price;
	private String storageCapacity;
	
	
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
	public String getStorageCapacity() {
		return storageCapacity;
	}
	
	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity=storageCapacity;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
		
	}

}
