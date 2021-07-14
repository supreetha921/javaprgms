class Continent{


public String name="Asia";
public int noOfCountries=48;
public String mountainBelt ="Himalayas";

public Continent(){
System.out.println();
}



@Override
public int hashCode(){
return this.ContinentId;
}

@Override
public boolean equals(Object cont){
if(cont instanceof Continent){


Continent cont=(Continent)cont;

if(this.hashCode()==cont.hashCode()) {


return true;
}



if(this.name.equals(cont.name)) {
return true;
}
else{
System.out.println("name is different");
}

if(this.noOfCountries==cont.noOfCountries)) {
return true;
}
else{
System.out.println("count is different");
}
if(this.mountainBelt.equals(cont.mountainBelt)) {
return true;
}
else{
System.out.println("different value");
}
}
else{
System.out.println("not of same type");
return false;
}
return false;
}
}








