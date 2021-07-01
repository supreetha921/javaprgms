import java.util.Scanner;

class TabletUtil{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the medicine Id:");
String MedicineId=sc.nextLine();
System.out.println("Enter the Price");
int Price=sc.nextInt();
System.out.println("Enter the type of medicine");
String type=sc.nextLine();
sc.close();
Tablet tablet=new Tablet();
tablet.MedicineId=MedicineId;
tablet.Price=Price;
tablet.type=type;

System.out.println(tablet.MedicineId+" "+tablet.Price+" "+
tablet.type);
}
}
