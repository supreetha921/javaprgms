class DamTester{

public static void main(String a[]){
Dam dam1=new Dam();
dam1.damId=12;
dam1.name="KRS";
dam1.location="Mandya";
dam1.constructedYear=1911;
System.out.println(dam1.damId);
System.out.println(dam1.hashCode());

Dam dam2=new Dam();
dam2.damId=12;
dam2.name="KRS";
dam2.location="Mysore";
dam2.constructedYear=1912;
System.out.println(dam2.damId);
System.out.println(dam2.hashCode());


boolean type=dam2.equals(dam1);

System.out.println(type);
}
}


