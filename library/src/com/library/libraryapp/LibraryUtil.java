package com.library.libraryapp;
import com.library.libraryapp.dto.LibraryDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class LibraryUtil {
	public static void main(String[] args) {
		LibraryDTO library=new LibraryDTO();
		library.setLibraryId(1);
		library.setLibraryName("central library");
		library.setLocation("Mg Road");
		library.setType("Government");
		
		
		LibraryDTO dto=new LibraryDTO();
		dto.setLibraryId(2);
		dto.setLibraryName("State Library");
		dto.setLocation("Mysore Road");
		dto.setType("Private");
		
		Collection<LibraryDTO> collection = new ArrayList<LibraryDTO>();
		collection.add(dto);
		collection.add(library);
		
		List<LibraryDTO> collection1 = new ArrayList<LibraryDTO>();
		collection1.add(dto);
		collection1.add(library);
		
		Set<String> collection3=new HashSet<String>();
		collection3.add("suppi");
		collection3.add("suppi");
		
		System.out.println(collection3.size());
		
		Collection<LibraryDTO> collection4 = new ArrayList<LibraryDTO>();

		collection4.add(dto);
		//collection4.add("2369");
		//collection4.add("06");
		//collection4.add("88");
		
		System.out.println(collection4.containsAll(collection1));
		System.out.println(collection4.contains(dto));
		System.out.println(collection4.hashCode());
	    System.out.println(collection4.isEmpty());
	    //System.out.println(collection4.removeAll(collection1));
		System.out.println(collection4.equals(collection));
		collection4.retainAll(collection4);
		System.out.println(collection4.size());
		
		
		
		
		Iterator<LibraryDTO>iterator =collection.iterator();
		while(iterator.hasNext())
		{
			LibraryDTO dto2=iterator.next();
			System.out.println(dto2);
		}
	}
 
}
