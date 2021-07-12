class PowerBankUtil{
public static void main(String a[])
{
PowerBankDTO dto=new PowerBankDTO();

dto.setName("Realme");
dto.setCapacity("10000Mah");
dto.setPrice(2000);

System.out.println(dto.getName());
System.out.println(dto.getPrice());
System.out.println(dto.getCapacity());
}
}