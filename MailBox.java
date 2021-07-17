class MailBox{
 
public static int NoOfMails;
public static String MailSubject;
public  static String source;
public static String destination;

public MailBox(){
System.out.println("MailBox Object is created");
}

static{
System.out.println("MailBox Block is started");
NoOfMails=255;
MailSubject="Resume";
source="gcsupreetha@gmail.com";
destination="xyz@gmail.com";
 System.out.println(NoOfMails+" "+MailSubject+" "+source+ " "+destination);
System.out.println("Init MailBox data");

}


{

System.out.println("MailBox Block is started");
NoOfMails=270;
MailSubject="Test Link";
source="abc@gmail.com";
destination="supreetha@gmail.com";

 System.out.println(NoOfMails+" "+MailSubject+" "+source+ " "+destination);
System.out.println("Init Mail data");
System.out.println("MailBox Block is ended");
}
public static void ProvidesInformation(){
 System.out.println(" Information is sent or recieved through mail");
}
}