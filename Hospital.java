class Hospital{

private String name;
public PatientDTO[] patients;
private int index;

public Hospital(int size){
            patients=new PatientDTO[size];

System.out.println(this.getClass().getSimpleName()+"object is created");
}


public void savePatients(PatientDTO patients){
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
for(int i=0;i<patients.length;i++){
if(patients[i]!=null)
{
  
System.out.println(patients[i].getPatientId()+" "+patients[i].getName()+" "+patients[i].getAddress()+" "+patients[i].getAge()+" "+patients[i].getMobileNo());
}

else{
System.out.println("no patient found");
}
}
}
public boolean updatePatientsMobileNoByPatientId(long mobileNo,String patientId){
System.out.println("invoked updatePatientsMobileNoByPatientId()");
boolean updatedMobileNo=false;
for(int i=0; i< patients.length;i++) {
if(patients[i]!=null)  {
if(patientId.equals(patients[i].getPatientId())){
         patients[i].setMobileNo(mobileNo);
    System.out.println("MobileNo updated");
         updatedMobileNo=true;
}
}
}

return updatedMobileNo;
}
public boolean deletePatientById(String patientId){
System.out.println("invoked deletePatientById()");
boolean deleted=false;
for(int i=0;i<patients.length;i++){
	if(patients[i]!=null){
	      if(patientId.equals(patients[i].getPatientId())){
	          patients[i]=null;
	          deleted=true;
	      }
                }
      }
return deleted;
}
public void getPatientByName(String name){
System.out.println("invoked DisplayInformationByName()");

for(int i=0;i<patients.length;i++){
if(patients[i]!=null){

        
    System.out.println(patients[i].getPatientId()+" "+patients[i].getName()+" "+patients[i].getAddress()+" "+patients[i].getAge()+" "+patients[i].getMobileNo() );
         
}
}



}
public void getPatientAgeByName(String name){
System.out.println("Invoked getPatientAgeByName()");
for(int i=0;i<patients.length;i++){
if(patients[i]!=null){
if(name.equals(patients[i].getName())){
System.out.println(patients[i].getAge());
}

}
}
}
public String getStateNameByPatientName(String name){
   String stateName=null;
 for(int i=0;i<patients.length;i++){
         if(patients[i]!=null){
                           if(name.equals(patients[i].getName())){
                              for(stateDTO state:patients[i].getAddress().getCountries().getStates()){
                                               for(AreaDTO area:city.getAreas()){
                                               System.out.println(area.getStreets());
                                               for(StreetDTO street:area.getStreets()){
                                                  streetNo=street.getStreetNo();
                        }
                   }
                 }
            }
     }
  }
}
return streetNo;


}


