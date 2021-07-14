class Bank{

public int bankId=67;
public String address="Rajajinagar";
public String ifscCode="SDFH678901";
public int noOfBranches=100;

public Bank(){
System.out.println();
}

public Number giveLoanOnRateOfinterest(){
return 5;
}

@Override
public int hashCode(){
return this.bankId;
}

@Override
public boolean equals(Object bank){
if(bank instanceof Bank){

return true;
}

else{
System.out.println("Not a same type");
return false;
}
}
}