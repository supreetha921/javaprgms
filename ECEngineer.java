class ECEngineer extends Engineer{

Constants branch=Constants.EC;

@Override
public void problemSolving(){
System.out.println("invoked problemSolving() of ECEngineer");
System.out.println("problem solved by"+this.branch);
}
public void construction(){
		System.out.println("designing and testing of electronic equipments"+this.branch);
	}
	
	public Constants getBranch(){
		return branch;
	}
}
