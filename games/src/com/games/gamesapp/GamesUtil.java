package com.games.gamesapp;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import  com.games.gamesapp.dto.GamesDTO;

public class GamesUtil {
	public static void main(String[] args) {
		
		ArrayList<GamesDTO> arrayList = new ArrayList<GamesDTO>();
		arrayList.add(new GamesDTO("Chess","Indoor",2));
		arrayList.add(new GamesDTO("Cricket","Outdoor",11));
		arrayList.add(new GamesDTO("carrom","Indoor",4));
	
		//fail safe
	Iterator<GamesDTO>iterator = arrayList.iterator();
     while(iterator.hasNext()) {
    	 GamesDTO games =iterator.next();
    	 System.out.println(games);
    	 if(games == new GamesDTO("carrom","Indoor",4)) {
    		 arrayList.add( new GamesDTO("Badminton","Indoor",4));
    	 }
    	 
     }
     System.out.println(arrayList);
     
	//ConcurrentModification Exception(fail fast)
	Iterator<GamesDTO>iterator1 = arrayList.iterator();
    while(iterator1.hasNext()) {
   	 GamesDTO games1 =iterator1.next();
   	 System.out.println(games1);
   	 if(games1.getName().equals("Chess")) {
   		 arrayList.remove(games1);
   	 }
   	 
   	 
    }
    System.out.println(arrayList);
    
	}
}
