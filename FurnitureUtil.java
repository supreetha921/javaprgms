class FurnitureUtil{
public static void main(String a[])
{
FurnitureDTO dto=new FurnitureDTO();
dto.setId(88);
dto.setName("RoyalOak");
dto.setType("sofa");
dto.setPrice(40000);

System.out.println(dto.getName());
System.out.println(dto.getPrice());
System.out.println(dto.getType());
System.out.println(dto.getId());
}
}