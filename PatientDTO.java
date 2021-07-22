public class patientDTO{

private String patientId;
private String name;
Private String[] address;
private long mobileNo;
private int age;


public PatientDTO(){
System.out.println(this.getClass().getSimpleName()+"object is created");
}
public String getPatientId(){
return patientId;
}

public void setPatientId(String patientId){
this.patientId=patientId;
}

public String getName(){
return name;
}

public void setName(String name){
this.name= name;
}

public String[] getAddress(){
return address;
}

public void setAddress(String[] address){
this.address=address;
}
public long getMobileNo(){
return mobileNo;
}

public void setMobileNo(long mobileNo){
this.mobileNo=mobileNo;
}
public String getAge(){
return age;
}

public void setAge(int age){
this.age=age;
}
}