package com.musicplayer.musicplayerapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MusicPlayerUtil {
	public static void main(String[] a) {

	List collection=new ArrayList();
	collection.add("wynk");
	collection.add("ganna");
	collection.add("spotify");
	collection.add(98);
	collection.add('E');
	collection.add(true);
	collection.add(3,"JioSaavn");
	
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
	collection1.add(67);
	collection1.add(84);
	collection1.add(1);
	collection1.add(167);
	
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

