class StateDTO{

private cityDTO[] city;

public StateDTO(){
System.out.println(this.getClass().getSimpleName() +"created");
}

public void setCities(CityDTO[]cities){
this.cities=cities;
}
public CityDTO getCities(){
return cities;
}
}