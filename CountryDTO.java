class CountryDTO{

private stateDTO[] areas;

public CountryDTO(){
System.out.println(this.getClass().getSimpleName() +"created");
}

public void setStates(StateDTO[]areas){
this.states=states;
}
public StateDTO getAreas(){
return states;
}
}