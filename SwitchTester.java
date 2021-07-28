import java.util.*;
class SwitchTester{
public static void main(String arf[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Light");
 String input=sc.next();
 //Consumer Logic
 
Switch light= LightFactory.getLight(input);
if(light!=null){
  light.sOn();
  light.sOff();
  }



}



}