class CivilEngineer extends Engineer{

Constants branch=Constants.CIVIL;

@Override
public void problemSolving(){
System.out.println("invoked problemSolving() of CivilEngineer");
System.out.println("problem solved by"+this.branch);
}
public void construction(){
		System.out.println("Constructing any buildings is the work of"+this.branch);
	}
	
	public Constants getBranch(){
		return branch;
	}
}