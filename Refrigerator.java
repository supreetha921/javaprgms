class Refrigerator{
 
public static int YearOfManufacture;
public static String Name;
public  static String VoltageCapacity;
public static String StorageCapacity;

public Refrigerator(){
System.out.println("Refrigerator Object is created");
}

static{
System.out.println("Refrigerator Block is started");
YearOfManufacture=2020;
Name="Samsung";
VoltageCapacity="220 volts";
StorageCapacity="275 Liters";
 System.out.println(StorageCapacity+" "+Name+" "+VoltageCapacity+ " "+ StorageCapacity);
System.out.println("Init Refrigerator data");
}

{


System.out.println("Refrigerator Block is started");
YearOfManufacture=2021;
Name="LG";
VoltageCapacity="210 volts";
StorageCapacity="300 Liters";
 System.out.println(StorageCapacity+" "+Name+" "+VoltageCapacity+ " "+ StorageCapacity);
System.out.println("Init Refrigerator data");
System.out.println(" Refrigerator Block is ended");
}
public static void KeepFoodCold(){
 System.out.println(" Keeps food fresh and cool");
}
}