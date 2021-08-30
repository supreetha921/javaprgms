package com.electronics.electrocisapp;

import com.electronics.electrocisapp.dto.ElectronicsDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.BiConsumer;




public class ElectronicsUtil {

	public static void main(String[] args) {
		ElectronicsDTO dto=new ElectronicsDTO();
		dto.setId("gh78");
		dto.setName("fan");
		dto.setType("manual");
		
		ElectronicsDTO dto1=new ElectronicsDTO();
		dto1.setId("gu16");
		dto1.setName("AC");
		dto1.setType("Automatic");
		
		/*Enumerator<ElectronicsDTO> enumeration=dto.elements();
		while (enumeration.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}*/ 
		
		Collection<ElectronicsDTO> collection = new ArrayList<ElectronicsDTO>();
		collection.add(dto);
		collection.add(dto1);
		
		List<ElectronicsDTO> collection1 = new ArrayList<ElectronicsDTO>();
		collection1.add(dto);
		collection1.addAll(collection);
		
		
		Set<ElectronicsDTO> collection2=new HashSet<ElectronicsDTO>();
		collection2.add(dto);
		collection2.add(null);
		collection2.add(dto1);
		collection2.add(null);
		
		//collection2.add("kitkat");
		
		System.out.println(collection2.size());
		Iterator<ElectronicsDTO>iterator =collection2.iterator();
		while(iterator.hasNext())
		{
			ElectronicsDTO collection3=iterator.next();
			System.out.println(collection3);
		}
	

		
		Collection<ElectronicsDTO> collection4 = new ArrayList<ElectronicsDTO>();

		collection4.add(dto);
		
		
		System.out.println(collection4.containsAll(collection1));
		System.out.println(collection4.contains(dto));
		System.out.println(collection4.hashCode());
	    System.out.println(collection4.isEmpty());
	    System.out.println(collection4.removeAll(collection1));
		System.out.println(collection4.equals(collection));
		//collection4.retainAll(dto1);
		System.out.println(collection4.size());
		
		
		
		
		Iterator<ElectronicsDTO>iterator1 =collection.iterator();
		while(iterator1.hasNext())
		{
			ElectronicsDTO collection5=iterator1.next();
			System.out.println(collection5);
		}
	    List<String> list= new ArrayList<String>();
	    list.add("4 years");
	    list.add("2 years");
	    list.add("10 years");
	    list.add("6 years");
	    list.add("8 years");
	    
	    System.out.println("Reading the elements from List with lambda expression");
	    Consumer<List<String>> consumer =(s)-> System.out.println(s);
	    consumer.accept(list);
	    
	    System.out.println("Subtracting two numbers");
	    BiConsumer<Integer, Double> bi= (z,n) -> System.out.println(z-n);
	    bi.accept(10,5.00);
	    
	    
	    
	    List<String> list1= new ArrayList<String>();
	    list1.add("4 years");
	    list1.add("2 years");
	    list1.add("10 years");
	    list1.add("16 years");
	    list1.add("8 years");
	    
	    System.out.println("Reading the elements from List with Method reference");
	   list.forEach(System.out::println);
	   
	}
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	

