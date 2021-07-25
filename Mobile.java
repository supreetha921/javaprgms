class Mobile{

private AppsDTO[] apps;
private int ind;

public Mobile(int size){
  apps=new AppsDTO[size];
  System.out.println(this.getClass().getSimpleName()+"object is created");
  }
  
public boolean createApps(AppsDTO apps){
boolean dataCreated=false;
  System.out.println("invoked createApps");
if(apps!=null){
	if(apps.getName()!=null && apps.getAppsId()>0){
    this.apps[ind++]=apps;
	dataCreated=true;
	}
  else{
	System.out.println("Id must be greater than zero");
}
}

System.out.println("createApps ended");
return dataCreated;
}

public void getApps(){
	System.out.println("invoked getApps");
for(AppsDTO appDTO:apps)
	if(appDTO!=null){
		System.out.println(appDTO.getAppsId()+" "+appDTO.getName()+" "+appDTO.getType()+" "+appDTO.getSizeInMb()+" "+appDTO.getInternetRequired());
	
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
public boolean deleteappsById(int appsId){
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
}

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
public void getAppByInternetRequired(boolean internetRequired){
		System.out.println("Invoked getAppByInternetRequired()");
		for(AppsDTO dto2 : apps){
			if(dto2!=null){
				if(internetRequired==dto2.getInternetRequired()){
					System.out.println(dto2.getAppsId()+" "+dto2.getName()+" "+dto2.getType()+" "+dto2.getSizeInMb()+" "+dto2.getInternetRequired());
				}else{
					System.out.println("App  not found");
				}
			}else{
				System.out.println("AppDTO not found");
	}
	}
	}
	public void getAppByType(String type){
		System.out.println("Invoked getAppByType()");
		for(AppsDTO dto3 : apps){
			if(dto3!=null){
				if(type.equals(dto3.getType())){
					System.out.println(dto3.getAppsId()+" "+dto3.getName()+" "+dto3.getType()+" "+dto3.getSizeInMb()+" "+dto3.getInternetRequired());
				
		}
		}
	}
	}
  
  
  
  
  }