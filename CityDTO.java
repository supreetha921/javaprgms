class CityDTO{

private AreaDTO[] streets;

public CityDTO(){
System.out.println(this.getClass().getSimpleName() +"created");
}

public void setAreas(AreaDTO[]areas){
this.areas=areas;
}
public AreaDTO getAreas(){
return areas;
}
}