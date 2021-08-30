package com.cafe.cafeapp.dto;
public class CafeDTO implements Comparable<CafeDTO> {
	
private int id;
private String name;
private String location;


public CafeDTO() {
	// TODO Auto-generated constructor stub
}


public CafeDTO(int id,String name,String location) {
	super();
	this.id=id;
	this.name=name;
	this.location=location;
	
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



public String getLocation() {
	return location;
}



public void setLocation(String location) {
	this.location = location;
}



@Override
public String toString() {
	return "CafeDTO [id=" + id + ", location=" + location + ", name=" + name + "]";
}
public int compareTo(CafeDTO o) {
	
	return this.getId()- o.getId();
}


}