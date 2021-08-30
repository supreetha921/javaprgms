package com.touristplaces.touristplacesapp.comparator;
import java.util.Comparator;

import com.touristplaces.touristplacesapp.dto.TouristPlaceDTO;

public class SortTouristPlaceByName implements Comparator<TouristPlaceDTO> {
	
	@Override
	public int compare(TouristPlaceDTO o1, TouristPlaceDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}


