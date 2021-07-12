class BiryaniUtil{
public static void main(String a[])
{
BiryaniDTO dto=new BiryaniDTO();

dto.setName("Hyderabadi Dum Biryani");
dto.setType("Non Veg");
dto.setPrice(180);

System.out.println(dto.getName());
System.out.println(dto.getPrice());
System.out.println(dto.getType());
}
}