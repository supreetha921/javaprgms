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
		System.out.println("Apps DTO object not found");
	}
}


public boolean updateAppSizeByName(String sizeInMb,String name){
boolean sizeUpdated=false;
	System.out.println("invoked updateAppSizeByName");
	for(AppsDTO dto1:apps){
	if(name!=null && sizeInMb!=null ){
		if(name.equals(dto1.getName())){
			dto1.setSizeInMb("sizeInMb");
			sizeUpdated=true;
		}
	}
	}
	return sizeUpdated;
}
/*public boolean deleteappsById(int appsId){
System.out.println("invoked deleteappsById()");
boolean deleted=false;
for(int i=0;i<apps.length;i++){
	if(apps[i]!=null){
	      if(appsId==apps[i].getAppsId()){
	          apps[i]=null;
	          deleted=true;
	      }
                }
      }
return deleted;
}*/

public boolean getappsById(int appsId){
System.out.println("getappsById()");
boolean appsdata=false;

for(AppsDTO app:apps){
if(app!=null){
if(appsId==app.getAppsId()){
	
	          
                   

        
    System.out.println(app.getAppsId()+" "+app.getName()+" "+app.getType()+" "+app.getSizeInMb()+" "+app.getInternetRequired() );
    appsdata=true;
}
}
}
return appsdata;

}
  
  
  
  
  }