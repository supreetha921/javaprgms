class Museums{
String name;
String type;
String location;
int EstablishedYear;
public Museums(String name,String type,String location,int EstablishedYear){
this.name=name;
this.type=type;
this.location=location;
this.EstablishedYear=EstablishedYear;
}
public static void preserve()
{
System.out.println("Museums purpose is to preserve selective objects");
}
public void printMuseumsDetails(){
System.out.println(name+" "+type+""+location+""+EstablishedYear);
}
}