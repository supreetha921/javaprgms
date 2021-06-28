class ResearchCenter{
String name;
String type;
String location;
int EstablishedYear;
public ResearchCenter(String name,String type,String location,int EstablishedYear){
this.name=name;
this.type=type;
this.location=location;
this.EstablishedYear=EstablishedYear;
}
public static void givesInformation()
{
System.out.println("ResearchCenter provides Information");
}
public void printResearchCenterDetails(){
System.out.println(name+" "+type+""+location+""+EstablishedYear);
}
}