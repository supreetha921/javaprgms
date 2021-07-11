class PlasticUtil{
	
	public static void main(String a[]){
		Plastic plastic =new Plastic();
		plastic.deforms();
		
		Chair chair =new Chair();
		chair.setId(67);
		chair.setPrice(700);
		chair.setName("Nilkamal");
		chair.thermoplastics();
		chair.seating();
		
		
                Plastic pt=new Chair();
		pt.setId(67);
		pt.setPrice(700);
		pt.setName("cello");
		
		Chair ref=(Chair)pt;
		ref.seating();
		System.out.println(pt.getId());
		System.out.println(pt.getPrice());
		System.out.println(pt.getName());
		
	
	
	}
}