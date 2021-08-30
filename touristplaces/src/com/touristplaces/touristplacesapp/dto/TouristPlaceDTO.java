package com.touristplaces.touristplacesapp.dto;

public class TouristPlaceDTO implements Comparable<TouristPlaceDTO> {

private int id;
private	String name;
private	String place;
private	int numberOfVisitor;
	
	


public  TouristPlaceDTO(int id, String name, String place, int numberOfVisitor) {
	this.id=id;
	this.name=name;
	this.place=place;
	this.numberOfVisitor=numberOfVisitor;
}

public TouristPlaceDTO() {
	// TODO Auto-generated constructor stub
}

public void TouristPlaceDTO() {
	
}

public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public int getNumberOfVisitor() {
	return numberOfVisitor;
}


public void setNumberOfVisitor(int numberOfVisitor) {
	this.numberOfVisitor = numberOfVisitor;
}

@Override
public String toString() {
	return "TouristPlaceDTO [id=" + id + ", name=" + name + ", place=" + place + ", numberOfVisitor=" + numberOfVisitor
			+ "]";
}

@Override
public int compareTo(TouristPlaceDTO o) {
	
	return this.getId()- o.getId();
}





}
