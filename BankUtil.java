import java.util.*;
class BankUtil{
	
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Apps array");
	int size=sc.nextInt();
	Bank bank=new Bank(size);
	
	for(int i=0;i<size;i++){
		System.out.println("Enter the Id");
		int BranchId=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Location");
		String location=sc.next();
		System.out.println("Enter the IfscCode");
		String ifscCode=sc.next();
		
		
		BranchDTO dto=new BranchDTO();
		dto.setBranchId(branchId);
		dto.setName(name);
		dto.setLocation(location);
		dto.setIfscCode(ifscCode);
		
		
		System.out.println(branch.createBranch(dto));
		
		
	}
	branch.getBranch();
	
	System.out.println("Enter the Name");
	String name1=sc.next();
	System.out.println("Enter the ifscCode");
	String ifscCode1=sc.next();
	System.out.println(branch.updateIfscCodeByName(size1,name1));
	
	branch.getBranch();
	System.out.println("Enter the BranchId");
	int branchId1=sc.nextInt();
	System.out.println(branch.deleteBranchById( branchId1));
	
	branch.getBranch();
	System.out.println("Enter the branchId");
	int branchId2=sc.nextInt();
	System.out.println(branch.getbranchById( branchId2));
	
	branch.getBranch();
	}
}