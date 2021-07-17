class Shop{
 
public static int ShopId;
public static String Name;
public  static String Type;


public Shop(){
System.out.println("Shop Object is created");
}

static{
System.out.println("Shop Block is started");
ShopId="78sj";
Name= "BestMart";
Type="provision store";
 System.out.println(ShopId+" "+Name+" "+Type);
System.out.println("Init Shop data");
}

{


System.out.println("Shop Block is started");
ShopId="67fl";
Name= "VegMart";
Type="Vegetable store";

 System.out.println(ShopId+" "+Name+" "+Type);
System.out.println("Init Shop data");
System.out.println(" Shop Block is ended");
}
public static void BuyProducts(){
 System.out.println("Buy daily essentials products ");
}
}