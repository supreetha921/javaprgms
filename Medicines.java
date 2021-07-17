class Medicines{
 
public static String MedicineId;
public static String Name;
public  static String Type;


public Medicines(){
System.out.println("Medicine Object is created");
}

static{
System.out.println("Medicine Block is started");
MedicineId="189ks";
Name= "Dolo650";
Type="Capsules";
 System.out.println(MedicineId+" "+Name+" "+Type);
System.out.println("Init Medicine data");
}

{


System.out.println("Medicine Block is started");
MedicineId="826nf";
Name= "Benadryl";
Type="Syrup";

 System.out.println(MedicineId+" "+Name+" "+Type);
System.out.println("Init Medicine data");
System.out.println(" Medicine Block is ended");
}
public static void CureDisease(){
 System.out.println("Medicine cure disease");
}
}