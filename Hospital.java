class Hospital{

private String name;
public patientDTO[] patients;
private int index;

public Hospital(){

System.out.println(this.getClass().getSimpleName()+"object is created");
}


public void savePatients(patientDTO patients){
if(patients!=null){
System.out.println("adding Patient Details");
this.patients[index]=patients;
index++;
}

else{
System.out.println("patient Details are Empty.... Please add the Patient details");
}
}
public void getPatients(){
for(int i=0;i<patients;i++){
if(patients[i]!=null)
{
  
System.out.println(patients[i].getPatientId()+" "+patients[i].getName()+" "+patients[i].getAddress()+" "+patients[i].getAge());
}

else{
System.out.println("no patient found");
}
}
}
public boolean updatePatientsMobileNoByPatientId(long mobileNo,String patientId){
System.out.println("invoked updatePatientsMobileNoByPatientId");
boolean updatedMobileNo=false;
for(int i=0;i<patients.length;i++){
if(patients[i]!=null){
if(patientId.equals(patients[i].getPatientId())){
         patient[i].setMobileNo(mobileNo);
    System.out.println("MobileNo updated");
         updatedMobileNo=true;
}
}
}

return updatedMobileNo;
}
public boolean deletePatientById(String patientId){
System.out.println("invoked deletePatientById()");
boolean delete=false;
for(int i=0;i<patients.length;i++){
	if(patients[i]!null){
	      if(patientid.equals(patients[i].getPatientId())){
	          patients[i]=null;
	          deleted=true;
	      }
                }
      }
return deleted;
}
public boolean DisplayInformationByName(String Name){
System.out.println("invoked DisplayInformationByName");
boolean DisplayInformation=false;
for(int i=0;i<patients.length;i++){
if(patients[i]!=null){
if(patientId.equals(patients[i].getPatientId())){
         patient[i].setName(name);
    System.out.println("Displayed By Name");
         NameDisplayed=true;
}
}
}