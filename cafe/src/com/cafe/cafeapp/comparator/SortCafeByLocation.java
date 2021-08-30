package com.cafe.cafeapp.comparator;
import java.util.Comparator;
import com.cafe.cafeapp.dto.CafeDTO;

public class SortCafeByLocation implements Comparator<CafeDTO> {

	@Override
	public int compare(CafeDTO o1, CafeDTO o2) {
		// TODO Auto-generated method stub
		return o1.getLocation().compareTo(o2.getLocation());
	}

}
