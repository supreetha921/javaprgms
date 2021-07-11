class Plastic{

int id;
int price;
String Name;


public Plastic(){
super();
	
	System.out.println("Plastic object is created");
}



public void thermoplastics(){
	System.out.println("Thermoplastic is one of the type of Plastic");
}

public void setId(int id){
	this.id=id;
}

public int getId(){
	return id;
}

public void setPrice(double price){
	this.price=price;
}

public double getPrice(){
	return price;
}

public void Name(String Name){
	this.Name=Name;
}

public String getBrandName(){
	return brandName;
}

}
}