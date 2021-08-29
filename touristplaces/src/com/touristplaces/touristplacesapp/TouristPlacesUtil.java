package com.touristplaces.touristplacesapp;
import com.touristplaces.touristplacesapp.dto.TouristPlaceDTO;
import  com.touristplaces.touristplacesapp.SortTouristPlaceByName;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TouristPlacesUtil {
	public static void main(String[] args) {

	TouristPlaceDTO dto = new TouristPlaceDTO();
	dto.setId(1);
	dto.setName("Mysore palace");
	dto.setPlace("Mysore");
	dto.setNumberOfVisitor(25000);
	
	TouristPlaceDTO dto1 = new TouristPlaceDTO();
	dto1.setId(2);
	dto1.setName("Taj Mahal");
	dto1.setPlace("Delhi");
	dto1.setNumberOfVisitor(40000);
	
	TouristPlaceDTO dto2 = new TouristPlaceDTO();
	dto2.setId(3);
	dto2.setName("Red fort");
	dto2.setPlace("Delhi");
	dto2.setNumberOfVisitor(80000);
	
	TouristPlaceDTO dto3 = new TouristPlaceDTO();
	dto3.setId(4);
	dto3.setName("Amer Fort");
	dto3.setPlace("Jaipur");
	dto3.setNumberOfVisitor(70000);
	
	List<TouristPlaceDTO> dtos=new ArrayList<TouristPlaceDTO>();
	dtos.add(new TouristPlaceDTO(1,"Mysore palace","Mysore",25000));
	dtos.add(new TouristPlaceDTO(3,"Red Fort","Delhi",80000));
	dtos.add(new TouristPlaceDTO(4,"Amer Fort","Jaipur",70000));
	dtos.add(new TouristPlaceDTO(2,"Taj Mahal","Delhi",40000));
	System.out.println("pre sorting");
	for (TouristPlaceDTO touristPlaceDTO : dtos) {
		System.out.println(touristPlaceDTO);
		
	}
	Collections.sort(dtos);
	System.out.println("Post sorting");
	for (TouristPlaceDTO touristPlaceDTO : dtos) {
		System.out.println(touristPlaceDTO);
		
	}
	System.out.println(dtos.size());
	//System.out.println(dtos.get(3));
	//System.out.println(dtos.size());
	
	
	System.out.println("Sorting FreedomFightersDTO By Name");
	System.out.println("Pre Sorting");
	Iterator<TouristPlaceDTO> itr = dtos.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("Post Sorting");
	Collections.sort(dtos,  SortTouristPlaceByName());
	Iterator<TouristPlaceDTO> itr1 = dtos.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	
	
	
	}

	private static Comparator SortTouristPlaceByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
