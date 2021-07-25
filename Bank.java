class Bank{

private BranchDTO[] branch;
private int ind;

public Bank(int size){
  branch=new BranchDTO[size];
  }
  
public boolean createBranch(BranchDTO branch){
boolean dataCreated=false;
  System.out.println("invoked createBranch");
if(branch!=null){
	if(branch.getName()!=null && branch.getBranchId()>0){
    this.branch[ind++]=branch;
	dataCreated=true;
	}
  else{
	System.out.println("Id must be greater than zero");
}
}

System.out.println("createBranch ended");
return dataCreated;
}

public void getBranch(){
	System.out.println("invoked getBranch");
for(BranchDTO DTO:branch)
	if(DTO!=null){
		System.out.println(DTO.getBranchId()+" "+DTO.getName()+" "+DTO.getLocation()+" "+DTO.getIfscCode());
	
	}
	else{
		System.out.println("Branch DTO object not found");
	}
}


public boolean updateIfscCodeByName(String ifscCode,String name){
boolean ifscCodeUpdated=false;
	System.out.println("invoked updateAppSizeByName");
	for(BranchDTO dto1:branch){
	if(name!=null && ifscCode!=null ){
		if(name.equals(dto1.getName())){
			dto1.setIfscCode("ifscCode");
			ifscCodeUpdated=true;
		}
	}
	}
	return ifscCodeUpdated;
}
public boolean deleteBranchById(int branchId){
System.out.println("invoked deleteBranchById()");
boolean deleted=false;
for(int i=0;i<branch.length;i++){
	if(branch[i]!=null){
	      if(branchId==branch[i].getBranchId()){
	          branch[i]=null;
	          deleted=true;
	      }
                }
      }
return deleted;
}

public boolean getBranchById(int branchId){
System.out.println("getBranchById()");
boolean branchdata=false;

for(BranchDTO br:branch){
if(br!=null){
if(branchId==br.getBranchId()){
	
	          
                   

        
    System.out.println(br.getBranchId()+" "+br.getName()+" "+br.getLocation()+" "+br.getIfscCode() );
    branchdata=true;
}
}
}
return branchdata;

}
  
  
  
  
  }