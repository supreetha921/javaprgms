package com.choclates.choclatesapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class choclatesUtil {
	public static void main(String[] a) {

	List collection2=new ArrayList();
	collection2.add("mars");
	collection2.add("dairymilk");
	collection2.add("kitkat");
	collection2.add(1);
	collection2.add('D');
	collection2.add(1,"snickers");
	
	System.out.println(collection2.size());
	ListIterator iterator =collection2.listIterator();
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
    List collection3=new ArrayList();
	collection3.add(22);
	collection3.add(110);
	collection3.add(90);
	collection3.add(178);
	
	System.out.println("Before");
	System.out.println(collection3);
	Collections.sort(collection3);
	System.out.println("After");
	System.out.println(collection3);
	System.out.println("Before");
	System.out.println(collection3);
    Collections.sort(collection3,Collections.reverseOrder());
    System.out.println("After");
	System.out.println(collection3);
    
    
    
	}

	/*private static Comparator reversOrder() {
		// TODO Auto-generated method stub
		return null;
	}*/
}
