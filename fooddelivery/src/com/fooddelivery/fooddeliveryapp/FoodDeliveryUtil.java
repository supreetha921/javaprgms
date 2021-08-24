package com.fooddelivery.fooddeliveryapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class FoodDeliveryUtil {
	public static void main(String[] a) {

	List collection=new ArrayList();
	collection.add("swiggy");
	collection.add("zomato");
	collection.add("Dunzo");
	collection.add(98);
	collection.add('E');
	collection.add(true);
	collection.add(2,"Uber Eats");
	
	System.out.println(collection.size());
	ListIterator iterator =collection.listIterator();
	while(iterator.hasNext())
	{
		Object object=iterator.next();
		System.out.println(object);
	}
    System.out.println("Backward Direction");
    while(iterator.hasPrevious())
	{
		
		System.out.println(iterator.previous());
	}
    List collection1=new ArrayList();
	collection1.add(01);
	collection1.add(89);
	collection1.add(148);
	collection1.add(4);
	
	System.out.println("Before");
	System.out.println(collection1);
	Collections.sort(collection1);
	System.out.println("After");
	System.out.println(collection1);
	System.out.println("Before");
	System.out.println(collection1);
    Collections.sort(collection1,Collections.reverseOrder());
    System.out.println("After");
	System.out.println(collection1);
    
    
    
	}

	
}

