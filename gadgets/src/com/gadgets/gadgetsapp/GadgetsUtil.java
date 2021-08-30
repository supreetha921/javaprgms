package com.gadgets.gadgetsapp;
import com.gadgets.gadgetsapp.dto.GadgetsDTO;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class GadgetsUtil {

	public static void main(String[] args) {
		
		 List<Object> list= new ArrayList<Object>();
		 list.add(789);
		 list.add(4);
		 list.add("gadgets");
	
		   
		   
		    
		    System.out.println("Reading the elements from List with lambda expression");
		    Consumer<List<Object>> consumer =(s)-> System.out.println(s);
		    consumer.accept(list);
		    
		    System.out.println("Multiplication of two numbers");
		    BiConsumer<Float, Integer> bi= (z,n) -> System.out.println(z*n);
		    bi.accept(67.9f,77);
		    
		    
		    
		  
		    
		    List<GadgetsDTO> list2= new ArrayList<GadgetsDTO>();
		    list2.add(new GadgetsDTO("56ru"," panasonic camera","camera"));
		    list2.add(new GadgetsDTO("io44","oppo headphones","headphones"));
		    list2.add(new GadgetsDTO("tg55","samsung smartphone","smartphone"));
		  
		    
		    System.out.println("Reading the elements from List with Method reference");
		   list2.forEach(System.out::println);
		   
		   
		}
	}