class Chair extends Plastic{
	
	@Override
	public void thermoplastics (){
	
		System.out.println(super.getId());
		System.out.println(super.getPrice());
		System.out.println(super.getName());
		
		System.out.println("Invoked thermo method in chair");
		
	}
	
	public void seating(){
		System.out.println("Chair is used for seating purpose");
	}
	
	