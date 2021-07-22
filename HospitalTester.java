import java.util.Scanner;
class HospitalTester{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();
Hospital hospital=new Hospital(size);

PatientDTO dto=new PatientDTO();
dto.setName("Hemanth");
dto.setPatientId("1");
dto.setAge(45);
dto.setMobileNo(7874634109L);
String addressDetails[]={"Hampinagar,Banglore-560040","Hubbali,Bangalore-789789"};
dto.setAddress(addressDetails);

PatientDTO patient=new PatientDTO();
patient.setName("Kishan");
patient.setPatientId("2");
patient.setAge(55);
patient.setMobileNo(7788291021L);
String addressDetails1[]={"vijayanagar,Banglore-560040","kulburgi,Bangalore-789782"};
dto.setAddress(addressDetails1);

hospital.savePatients(dto);
hospital.savePatients(patient);
hospital.getPatients();

boolean updateMobileNo=hospital.updatePatientsMobileNoByPatientId(8866728109L,"1");
System.out.println(updateMobileNo);
hospital.getPatients();

hospital.deletePatientById("1");
hospital.getPatients();

hospital.getPatientByName("Hemanth");
hospital.getPatientAgeByName("Kishan");

}
}