class FruitUtil{
public static void main(String a[])
{
FruitDTO dto=new FruitDTO();

dto.setName("grapes");
dto.setColor("purple");
dto.setPrice(60);

System.out.println(dto.getName());
System.out.println(dto.getPrice());
System.out.println(dto.getColor());
}
}