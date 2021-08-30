package com.companies.companiesapp;

import com.companies.companiesapp.dto.CompaniesDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;



public class CompaniesUtil {

	public static void main(String[] args) {
		
		 List<String> list= new ArrayList<String>();
		 list.add("Infosys");
		 list.add("wipro");
		 list.add("L and T");
	
		   
		   
		    
		    System.out.println("Reading the elements from List with lambda expression");
		    Consumer<List<String>> consumer =(s)-> System.out.println(s);
		    consumer.accept(list);
		    
		    System.out.println("Adding two numbers");
		    BiConsumer<String, String> bi= (z,n) -> System.out.println(z+n);
		    bi.accept("Info","wipro");
		    
		    
		    
		  
		    
		    List<CompaniesDTO> list2= new ArrayList<CompaniesDTO>();
		    list2.add(new CompaniesDTO("56rg","Infosys","mysore"));
		    list2.add(new CompaniesDTO("io89","Concentrix","manglore"));
		    list2.add(new CompaniesDTO("87ytg","wipro","mandya"));
		    list2.add(new CompaniesDTO("45er","Amazon","Mumbai"));
		   
		    
		    System.out.println("Reading the elements from List with Method reference");
		   list2.forEach(System.out::println);
		   
		   
		}
	}