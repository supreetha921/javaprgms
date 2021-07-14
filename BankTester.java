class BankTester{

public static void main(String a[]){
Bank sbi1=new Bank();
sbi1.bankId=67;
sbi1.address="Rajajinagar";
System.out.println(sbi1.noOfBranches);
System.out.println(sbi1.hashCode());
Bank sbi=new Bank();
System.out.println(sbi.noOfBranches);
sbi.bankId=678;
sbi.address="rajajinagar";
System.out.println(sbi.hashCode());
boolean type=sbi1.equals(sbi);

System.out.println(sbi.noOfBranches);

System.out.println(type);
}
}


