package com.clone.cloneapp.country;

public class Country implements Cloneable{

	private String name;
	private int population;
	private String capitalCity;
	
	public String getName()  {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getPopulation() {
		return population;
		
	}
	public void setPopulation(int population) {
		this.population=population;
	}
	public String getcapitalCity() {
		return capitalCity;
	}
	public void setcapitalCity(String capitalCity) {
		this.capitalCity=capitalCity;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		//TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
	
	
	
	
	
}
