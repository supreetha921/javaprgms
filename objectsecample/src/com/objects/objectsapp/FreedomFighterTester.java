package com.objects.objectsapp;
import com.objects.objectsapp.FreedomFighter;



public class FreedomFighterTester {
	
	public static void main(String a[])
	{
	  FreedomFighter ff=new FreedomFighter();
	  ff.name="Bhagath singh";
	  ff.DOB="Sep 1907";
	  ff.slogan="long live the revolution";
	  ff.noOfYearsFoughtForFreedom=12;
	  System.out.println(ff.name +" "+ ff.DOB +" "+ ff.slogan +" "+ ff.noOfYearsFoughtForFreedom);

	FreedomFighter fr=new FreedomFighter();
	  fr.name="Subash Chandra Bose";
	  fr.DOB="23 Jan 1897";
	  fr.slogan="give me blood and I shall give you freedom";
	  fr.noOfYearsFoughtForFreedom=20;
	  System.out.println(fr.name +" "+ fr.DOB +" "+ fr.slogan +" "+ fr.noOfYearsFoughtForFreedom);
	  
	  
	 
	ff.giveFreedom();
	ff.develop();
	}

}
