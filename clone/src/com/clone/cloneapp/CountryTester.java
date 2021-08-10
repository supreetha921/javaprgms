package com.clone.cloneapp;
import com.clone.cloneapp.country.Country;
public class CountryTester {
	public static void main(String[] args) {
		Country cty=new Country();
		cty.setName("India");
		cty.setcapitalCity("Delhi");
		cty.setPopulation(10000000);
		
		System.out.println(cty.getName()+" "+cty.getcapitalCity()+" "+cty.getPopulation());
		
		try {
			Country cty2=(Country) cty.clone();
			cty2.setPopulation(11000000);
			
			System.out.println(cty2.getName()+" "+cty2.getcapitalCity()+" "+cty2.getPopulation());
		}
			
			catch(CloneNotSupportedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}
