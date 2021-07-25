class BranchDTO{

private int branchId;
private String name;
private String location;
private String ifscCode;


public BranchDTO(){
System.out.println(this.getClass().getSimpleName()+"Object is created");

}
public void setBranchId(int appsId){
	this.branchId=branchId;
	
}
public int getBranchId(){
return branchId;
}
public void setName(String name ){
	this.name=name;
}
	
public String getName(){
return name;
}
public void setLocation(String location){
	this.location=location;
	
}
public String getLocation(){
return location;
}
public void setIfscCode(String ifscCode){
	this.ifscCode=ifscCode;
	
}
public String getIfscCode(){
return ifscCode;
}




}