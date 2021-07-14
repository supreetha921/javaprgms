class VaccineTester{

public static void main(String a[]){
Vaccine v1=new Vaccine();
v1.vaccineId=14;
v1.name="Covaxin";
v1.types="covid19";
v1.agelimit="Above 18";
System.out.println(v1.damId);
System.out.println(v1.hashCode());

vaccine v2=new Dam();
v2.vaccineId=14;
v2.name="covisheild";
v2.types="covid19";
v2.agelimit="Above 45";
System.out.println(v2.vaccineId);
System.out.println(v2.hashCode());


boolean type=v2.equals(v1);

System.out.println(type);
}
}


