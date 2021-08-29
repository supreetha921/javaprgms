package com.games.gamesapp.dto;

import java.io.Serializable;

public class GamesDTO implements Serializable {

private	String name;
private	String type;
private	int noOfPlayers;


public GamesDTO(String name, String type, int noOfPlayers) {
		this.name=name;
		this.type=type;
		this.noOfPlayers=noOfPlayers;
	}

public void GamesDTO() {
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}

public int getNoOfPlayers() {
	return noOfPlayers;
}


public void setNoOfPlayers(int noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
}



@Override
public String toString() {
	return "GamesDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
}









}