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





Food food =new Maggi();
food.FoodId=FoodId;
food.Price=Price;
food.ManufactureDate=ManufactureDate;
food.ExpiryDate=ExpiryDate;
food.ToBeActive();
System.out.println(FoodId+" "+Price+" "+ManufactureDate+" "+
ExpiryDate);
}
}
