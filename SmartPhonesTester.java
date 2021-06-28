class SmartPhonesTester{
public static void main(String a[])
{
  SmartPhones smart=new SmartPhones();
  smart.name="Samsung Galaxy S21";
  smart.ReleasedYear=2021;
  smart.TypeOfNetwork="5G";
  smart.OSType="Android 11";
  System.out.println( smart.name+" "+  smart.ReleasedYear
  +" "+ smart.TypeOfNetwork+" "+ smart.OSType);

  SmartPhones st=new SmartPhones();
  st.name="Apple iphone 11";
  st.ReleasedYear=2019;
  st.TypeOfNetwork="4G";
  st.OSType="ios 13";
  System.out.println( st.name+" "+  st.ReleasedYear
  +" "+ st.TypeOfNetwork+" "+ st.OSType);
  
smart.toRunApplications();
smart.connect();
}
}
