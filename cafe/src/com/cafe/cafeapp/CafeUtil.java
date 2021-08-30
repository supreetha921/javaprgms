package com.cafe.cafeapp;

import com.cafe.cafeapp.comparator.SortCafeByLocation;


import com.cafe.cafeapp.comparator.SortCafeByName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.cafe.cafeapp.dto.CafeDTO;


public class CafeUtil {

	public static void main(String[] args) {

		CafeDTO dto = new CafeDTO();
		dto.setId(1);
		dto.setName("Good Vibes");
		dto.setLocation("Mysore");
		
		
		CafeDTO dto1 = new CafeDTO();
		dto1.setId(2);
		dto1.setName("Havana");
		dto1.setLocation("Banglore");
		
		CafeDTO dto2 = new CafeDTO();
		dto1.setId(3);
		dto1.setName("Cafe Tara");
		dto1.setLocation("Mandya");
		
		List<CafeDTO> dtos=new ArrayList<CafeDTO>();
		dtos.add(new CafeDTO(1,"Good Vibes","Mysore"));
		dtos.add(new CafeDTO(3,"Cafe Tara","Mandya"));
		dtos.add(new CafeDTO(2,"Havana","Banglore"));
		
		System.out.println("pre sorting");
		for (CafeDTO touristPlaceDTO : dtos) {
			System.out.println(touristPlaceDTO);
			
		}
		Collections.sort(dtos);
		System.out.println("Post sorting");
		for (CafeDTO DTO : dtos) {
			System.out.println(DTO);
			
		}
		System.out.println(dtos.size());
		//System.out.println(dtos.get(3));
		//System.out.println(dtos.size());
		
		
		System.out.println("Sorting  By Name");
		System.out.println("Pre Sorting");
		Iterator<CafeDTO> itr = dtos.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Post Sorting");
		Collections.sort(dtos,new SortCafeByName());
		Iterator<CafeDTO> itr1 = dtos.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
		

		

		System.out.println("Post Sorting");
		Collections.sort(dtos, new SortCafeByLocation());
		Iterator<CafeDTO> i = dtos.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		}

	
	
	}
