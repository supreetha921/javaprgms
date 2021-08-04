package com.transportation.transportationapp;


public class TransportationTester {
	public static void main(String a[])
	{
	

		Transportation transport=new Transportation();
		transport.name="Train";
		transport.typeOfMode="RailwayTracks";
		transport.kilometer=880;
		System.out.println(transport.name+" "+transport.typeOfMode+"  "+transport.kilometer);

}
}