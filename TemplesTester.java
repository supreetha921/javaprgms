class SmartPhonesTester{
public static void main(String a[])
{
  SmartPhones smart=new SmartPhones();
  smart.name="Samsung Galaxy S21";
  smart.ReleasedYear="2021";
  smart.TypeOfNetwork="5G";
  smart.OSType="Android 11";
  System.out.println( smart.name+" "+  smart.ReleasedYear
  +" "+ smart.TypeOfNetwork+" "+ smart.OSType);

  SmartPhones st=new SmartPhones();
  st.name="Samsung Galaxy S21";
  st.ReleasedYear="2021";
  st.TypeOfNetwork="5G";
  st.OSType="Android 11";
  System.out.println( st.name+" "+  st.ReleasedYear
  +" "+ st.TypeOfNetwork+" "+ st.OSType);
  
smart.toRunApplications();
smart.connect();
}
}
