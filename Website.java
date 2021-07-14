class Website{

public int websiteId=44;
public String name="Flipkart";
public String types="Shopping";


public Website(){
System.out.println();
}



@Override
public int hashCode(){
return this.websiteId;
}

@Override
public boolean equals(Object web){
if(vacc instanceof Vaccine){


Website web=(Website)web;

if(this.hashCode()==web.hashCode()) {


return true;
}


if(this.websiteId==web.websiteId){
return true;
}
else{
System.out.println("Id is different");
}
if(this.name.equals(web.name)) {
return true;
}
else{
System.out.println("name is different");
}

if(this.types.equals(web.types)) {
return true;
}
else{
System.out.println("type is different");
}

}
else{
System.out.println("not of same type");
return false;
}
return false;
}
}








