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

 

smart.Applications();
}
}
