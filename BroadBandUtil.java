class BroadBandUtil{
public static void main(String a[])
{
BroadBandDTO dto=new BroadBandDTO();

dto.setName("Airtel");
dto.setType("Wireless");
dto.setPrice(3940);

System.out.println(dto.getName());
System.out.println(dto.getPrice());
System.out.println(dto.getType());
}
}