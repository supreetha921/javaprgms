class Youtube{

private ChannelsDTO[] channels;
private int ind;

public Youtube(int size){
  channels=new ChannelsDTO[size];
  }
  
public boolean createChannels(ChannelsDTO channels){
boolean dataCreated=false;
  System.out.println("invoked createChannels");
if(channels!=null){
	if(channels.getName()!=null && channels.getChannelId()>0){
    this.channels[ind++]=channels;
	dataCreated=true;
	}
  else{
	System.out.println("Id must be greater than zero");
}
}

System.out.println("createChannels ended");
return dataCreated;
}

public void getChannels(){
	System.out.println("invoked getChannels");
for(ChannelsDTO DTO:channels)
	if(DTO!=null){
		System.out.println(DTO.getChannelId()+" "+DTO.getName()+" "+DTO.getType()+" "+DTO.getNoOfSubscribers());
	
	}
	else{
		System.out.println("Channels DTO object not found");
	}
}


public boolean updateNoOfSubscribersByName(String noOfSubsribers,String name){
boolean NoOfSubscribersUpdated=false;
	System.out.println("invoked updateNoOfSubscribersByName");
	for(ChannelsDTO dto1:channels){
	if(name!=null && noOfSubsribers!=null ){
		if(name.equals(dto1.getName())){
			dto1.noOfSubsribers("noOfSubsribers");
			NoOfSubscribersUpdated=true;
		}
	}
	}
	return NoOfSubscribersUpdated;
}
public boolean deletechannelById(int channelId){
System.out.println("invoked deletechannelById()");
boolean deleted=false;
for(int i=0;i<channels.length;i++){
	if(channels[i]!=null){
	      if(appsId==channels[i].getChannelId()){
	          channels[i]=null;
	          deleted=true;
	      }
                }
      }
return deleted;
}

public boolean getchannelsByIgetchannelsById(int channelId){
System.out.println("getchannelsById()");
boolean channeldata=false;

for(channelsDTO channel:channels){
if(channel!=null){
if(channelId==channel.channelId()){
	
	          
                   

        
    System.out.println(channel.getChannelId()+" "+channel.getName()+" "+channel.getType()+" "+channel.getNoOfSubscribers() );
    channeldata=true;
}
}
}
return channeldata;

}
  
  
  
  
  }