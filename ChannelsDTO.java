class ChannelsDTO{

private int channelId;
private String name;
private String type;
private int noOfSubsribers;


public ChannelDTO(){
System.out.println(this.getClass().getSimpleName()+"Object is created");

}
public void ChannelId(int channelId){
	this.channelId=channelId;
	
}
public int getChannelId(){
return channelId;
}
public void setName(String name ){
	this.name=name;
}
	
public String getName(){
return name;
}
public void setType(String type){
	this.type=type;
	
}
public String getType(){
return type;
}
public int setNoOfSubscribers(String noOfSubsribers){
	this.noOfSubsribers=noOfSubsribers;
	
}
public String getNoOfSubscribers(){
return noOfSubsribers;
}





}