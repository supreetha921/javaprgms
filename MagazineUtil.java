class MagazineUtil{
public static void main(String a[])
{
MagazineDTO dto=new MagazineDTO();
dto.setNoOfPages(45);
dto.setName("Sparda Spoorthi");
dto.setType("Competative");
dto.setPrice(50.00);
System.out.println(dto.getNoOfPages());
System.out.println(dto.getName());
System.out.println(dto.getPrice());
System.out.println(dto.getType());
}
}