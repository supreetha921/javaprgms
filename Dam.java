class Dam{

public int damId=12;
public String name="KRS";
public String location="Mandya";
public String constructedYear=1911;

public Dam(){
System.out.println();
}



@Override
public int hashCode(){
return this.DamId;
}

@Override
public boolean equals(Object dam){
if(dam instanceof Dam){


Dam dam=(Dam)dm;

if(this.hashCode()==dam.hashCode()) {


return true;
}


if(this.damId==dam.damId){
return true;
}
else{
System.out.println("Id is different");
}
if(this.name.equals(vacc.name)) {
return true;
}
else{
System.out.println("name is different");
}

if(this.location.equals(dam.location)) {
return true;
}
else{
System.out.println("location is different");
}
if(this.constructedYear==dam.constructedYear) {
return true;
}
else{
System.out.println("different year");
}
}
else{
System.out.println("not of same type");
return false;
}
return false;
}
}








