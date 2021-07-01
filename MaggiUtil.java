import java.util.Scanner;

class MaggiUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the FoodId");
String FoodId=sc.nextLine();
System.out.println("Enter the price");
int Price=sc.nextInt(); 
System.out.println("Enter the Manufactured date");
String ManufactureDate=sc.nextLine();
System.out.println("Enter the Expiry date");
String ExpiryDate=sc.nextLine();
sc.close();


System.out.println("FoodId");
Maggi maggi=new Maggi();
maggi.FoodId=FoodId;
maggi.Price=Price;
maggi.ManufactureDate=ManufactureDate;
maggi.ExpiryDate=ExpiryDate;
System.out.println(maggi.FoodId+" "+maggi.Price+" "+maggi.ManufactureDate+" "+
maggi.ExpiryDate);
}
}
