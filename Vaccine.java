class Vaccine{

public int vaccineId=14;
public String name="Covaxin";
public String types="covid19";
public String agelimit="Above 18";

public Vaccine(){
System.out.println();
}



@Override
public int hashCode(){
return this.VaccineId;
}

@Override
public boolean equals(Object vacc){
if(vacc instanceof Vaccine){


Vaccine vacc=(Vaccine)vacc;

if(this.hashCode()==dm.hashCode()) {


return true;
}


if(this.vaccineId==dm.vaccineId){
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

if(this.types.equals(vacc.types)) {
return true;
}
else{
System.out.println("type is different");
}
if(this.agelimit==vacc.agelimit) {
return true;
}
else{
System.out.println("different age");
}
}
else{
System.out.println("not of same type");
return false;
}
return false;
}
}








