class Exam{
public String code;
public HallTicket hallTicket;
public static String universityName="VTU";
double fees;


public Exam(){
System.out.println("Exam Object is created");
}
public boolean allow(HallTicket hallTicket){
System.out.println("invoked allow");
boolean there=true;
if(this.fees>=1000){
System.out.println("fees is paid");
this.hallTicket=hallTicket;
this.hallTicket.displayHallTicketDetails();
System.out.println("EXAMCODE:"+this.code);
}
else{
System.out.println("fees is less");
}
return there;
}
}