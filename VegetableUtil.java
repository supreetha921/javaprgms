class VegetableUtil{
public static void main(String a[])
{
VegetableDTO dto=new VegetableDTO();

dto.setName("Tomato");
dto.setColor("Red");
dto.setPrice(20);

System.out.println(dto.getName());
System.out.println(dto.getPrice());
System.out.println(dto.getColor());
}
}