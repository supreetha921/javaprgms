package com.inherit.example;
import java.util.Scanner;

import com.inherit.example.inheritance.CocaCola;
public class CocaColaUtil {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the softdrinks Id");
	int softdrinksId=sc.nextInt();
	System.out.println("Enter the price");
	double price=sc.nextDouble();
	System.out.println("Enter the name");
	String name=sc.next();
	System.out.println("Enter the expiry date");
	int expDate=sc.nextInt();
	
	System.out.println(softdrinksId);
	CocaCola coco=new CocaCola();
	coco.softdrinksId=softdrinksId;
	coco.price=price;
	coco.name=name;
	coco.expDate=expDate;
	System.out.println(coco.softdrinksId+" "+coco.price+" "+coco.name+" "+coco.expDate);

}
}