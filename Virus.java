class Virus{
String name;
String species;
String Symptoms;
int FoundedYear;
public Virus(String name,String species,String Symptoms,int FoundedYear){
this.name=name;
this.species=species;
this.Symptoms=Symptoms;
this.FoundedYear=FoundedYear;
}
public static void Infection()
{
System.out.println("Virus infects living organisms");
}
public void printVirusDetails(){
System.out.println(name+" "+species+""+Symptoms+""+FoundedYear);
}
}