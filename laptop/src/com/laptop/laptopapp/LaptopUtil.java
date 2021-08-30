package com.laptop.laptopapp;

import com.laptop.laptopapp.dto.LaptopDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class LaptopUtil {

	public static void main(String[] args) {
		
		 List<Object> list= new ArrayList<Object>();
		 list.add(789);
		 list.add(4);
		 list.add("laptop");
	
		   
		   
		    
		    System.out.println("Reading the elements from List with lambda expression");
		    Consumer<List<Object>> consumer =(s)-> System.out.println(s);
		    consumer.accept(list);
		    
		    System.out.println("Division of two numbers");
		    BiConsumer<Integer,Integer> bi= (z,n) -> System.out.println(z/n);
		    bi.accept(34,2);
		    
		    
		    
		  
		    
		    List<LaptopDTO> list2= new ArrayList<LaptopDTO>();
		    list2.add(new LaptopDTO("56hp","HP",56000));
		    list2.add(new LaptopDTO("dl19","Dell",51000));
		    list2.add(new LaptopDTO("le61","Lenovo",60000));
		  
		    
		    System.out.println("Reading the elements from List with Method reference");
		   list2.forEach(System.out::println);
		   
		   
		}
	}