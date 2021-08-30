package com.restuarant.restuarantapp;

import com.restuarant.restuarantapp.dto.RestaurantDTO;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.Set;
import java.util.TreeSet;



public class RestaurantUtil {
	public static void main(String[] args) {
	
	 List<String> list= new ArrayList<String>();
	 list.add("Mahesh prasad");
	 list.add("foodies zone");
	 list.add("lemon tree");
	 list.add("Southern heritage");
	   
	   
	    
	    System.out.println("Reading the elements from List with lambda expression");
	    Consumer<List<String>> consumer =(s)-> System.out.println(s);
	    consumer.accept(list);
	    
	    System.out.println("Adding two numbers");
	    BiConsumer<Integer, Double> bi= (z,n) -> System.out.println(z+n);
	    bi.accept(10,5.00);
	    
	    
	    
	   /* Set<RestaurantDTO> set1= new TreeSet<RestaurantDTO>();
	    set1.add(new RestaurantDTO(1,"mylari hotel","mysore"));
	    set1.add(new RestaurantDTO(2,"mahesh prasad","manglore"));
	    set1.add(new RestaurantDTO(3,"good vibes","mandya"));
	    set1.add(new RestaurantDTO(4,"southern heritage","hassan"));
	   
	    
	    Consumer<Set<RestaurantDTO>> consumer1 =(k)-> System.out.println(set1);
	    consumer1.accept(set1);
	    */
	    
	    List<RestaurantDTO> list2= new ArrayList<RestaurantDTO>();
	    list2.add(new RestaurantDTO(1,"mylari hotel","mysore"));
	    list2.add(new RestaurantDTO(2,"mahesh prasad","manglore"));
	    list2.add(new RestaurantDTO(3,"good vibes","mandya"));
	    list2.add(new RestaurantDTO(4,"southern heritage","hassan"));
	   
	    
	    System.out.println("Reading the elements from List with Method reference");
	   list2.forEach(System.out::println);
	   
	   
	}
}





	
	
	
	
	


