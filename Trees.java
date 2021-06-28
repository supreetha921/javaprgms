class Trees{
String name;
String uses;
int lifespan;
String Scientificname;
public Trees(String name,String uses,int lifespan,String Scientificname){
this.name=name;
this.uses=uses;
this.lifespan=lifespan;
this.Scientificname=Scientificname;
}
public static void givesOxygen()
{
System.out.println("Trees provide oxygen to living Beings");
}
public void printTreesDetails(){
System.out.println(name+" "+uses+""+lifespan+""+Scientificname);
}
}