class Train{
 
public static int trainNo;
public static String trainName;
public  static String source;
public static String destination;

public Train(){
System.out.println("Train Object is created");
}

static{
System.out.println("Train Block is started");
trainNo=90786;
trainName="Charminar Express";
source="chennai";
destination="hyderabad";
 System.out.println(trainNo+" "+trainName+" "+source+ " "+destination);
System.out.println("Init train data");
}

{

System.out.println("Train Block is started");

trainNo=90789;
trainName="TippuExpress";
source="Banglore";
destination="Mysoru";
 System.out.println(trainNo+" "+trainName+" "+source+ " "+destination);
System.out.println("Init train data");
System.out.println("Train Block is ended");
}
public static void CarryingPassenger(){
 System.out.println(" carrying passengers in bulk");
}
}