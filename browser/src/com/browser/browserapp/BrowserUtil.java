package com.browser.browserapp;
import com.browser.browserapp.dto.BrowserDTO;


import  java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BrowserUtil {
	
	public static void main(String[] args) {
		BrowserDTO dto=new BrowserDTO();
		dto.setName("Chrome");
		dto.setSizeInMb("34Mb");
		dto.setVersion("7.0");
		
		BrowserDTO dto1=new BrowserDTO();
		dto1.setName("Microsoft Edge");
		dto1.setSizeInMb("40Mb");
		dto1.setVersion("6.0");
		
		
		
		
		Collection<BrowserDTO> collection = new ArrayList<BrowserDTO>();
		collection.add(dto);
		collection.add(dto1);
		
		List<BrowserDTO> collection1 = new ArrayList<BrowserDTO>();
		collection1.add(dto);
		collection1.addAll(collection);
		
		Set<String> collection2=new HashSet<String>();
		collection2.add("apple");
		collection2.add("vivo");
		collection2.add("vivo");
		
		System.out.println(collection2.size());
		Iterator<String>iterator =collection2.iterator();
		while(iterator.hasNext())
		{
			String collection21=iterator.next();
			System.out.println(collection21);
		}
	

		
		Collection<BrowserDTO> collection4 = new ArrayList<BrowserDTO>();

		collection4.add(dto);
		
		
		System.out.println(collection4.containsAll(collection1));
		System.out.println(collection4.contains(dto));
		System.out.println(collection4.hashCode());
	    System.out.println(collection4.isEmpty());
	    System.out.println(collection4.removeAll(collection1));
		System.out.println(collection4.equals(collection));
		collection4.retainAll(collection2);
		System.out.println(collection4.size());
		
		
		
		
		Iterator<BrowserDTO>iterator1 =collection.iterator();
		while(iterator1.hasNext())
		{
			BrowserDTO collection5=iterator1.next();
			System.out.println(collection5);
		}
	}
}



