import java.util.*;
class YoutubeUtil{
	
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of channels array");
	int size=sc.nextInt();
	Youtube tube=new Youtube(size);
	
	for(int i=0;i<size;i++){
		System.out.println("Enter the Id");
		int appsId=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Type");
		String type=sc.next();
		System.out.println("Enter the NoOfSunscribers");
		String sizeInMb=sc.next();
		
		
		ChannelsDTO dto=new ChannelsDTO();
		dto.setChannelId(appsId);
		dto.setName(name);
		dto.setType(type);
		dto.setNoOfSubscribers(noOfSubscribers);
		
		
		System.out.println(tube.createChannels(dto));
		
		
	}
	tube.getChannels();
	
	System.out.println("Enter the Name");
	String name1=sc.next();
	System.out.println("Enter the Number of subscribers");
	String number1=sc.next();
	System.out.println(tube. updateNoOfSubscribersByName(number1,name1));
	
	tube.getChannels();
	System.out.println("Enter the channelId");
	int channelId=sc.nextInt();
	System.out.println(tube.deletechannelById( channelId));
	
	tube.getChannels();
	System.out.println("Enter the channelId");
	int channelId1=sc.nextInt();
	System.out.println(mobile.getchannelsById( channelId1));
	
	tube.getChannels();
	}
}