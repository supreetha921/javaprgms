class AreaDTO{

private StreetDTO[] streets;

public AreaDTO(){
System.out.println(this.getClass().getSimpleName() +"created");
}

public void setStreets(StreetDTO[]streets){
this.streets=streets;
}
public CityDTO getStreets(){
return streets;
}
}