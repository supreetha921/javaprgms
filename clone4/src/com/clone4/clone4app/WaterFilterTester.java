package com.clone4.clone4app;

import com.clone4.clone4app.waterfilter.WaterFilter;

public class WaterFilterTester {
	public static void main(String[] args) {
		WaterFilter filter=new WaterFilter();
		filter.setName("Eureka");
		filter.setPrice(20000);
		filter.setStorageCapacity("18 Liters");
		
		System.out.println(filter.getName()+" "+filter.getPrice()+" "+filter.getStorageCapacity());
		
		try {
			WaterFilter filter2=(WaterFilter) filter.clone();
			filter2.setPrice(18500);
			
			System.out.println(filter2.getName()+" "+filter2.getPrice()+" "+filter2.getStorageCapacity());
		}
			
			catch(CloneNotSupportedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
