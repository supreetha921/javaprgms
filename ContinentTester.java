class ContinentTester{

public static void main(String a[]){
Continent c1=new Continent();

c1.name="Asia";
c1.noOfCountries="48";
c1.mountainBelt="Himalayas";
System.out.println(c1.name);
System.out.println(v1.hashCode());

c2.name="Australia";
c2.noOfCountries="48";
c2.mountainBelt="Blue Mountains";
System.out.println(c2.name);
System.out.println(c2.hashCode());

boolean type=c2.equals(c1);

System.out.println(type);
}
}


