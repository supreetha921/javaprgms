public class MagazineDTO
{
private int noOfPages;
private double price;
private String name;
private String type;

public MagazineDTO(){
}

public int getNoOfPages(){
return noOfPages;
}

public void setNoOfPages(int noOfPages){
this.noOfPages=noOfPages;
}

public String getType(){
return type;
}
public void setType(String type){
this.type=type;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}
public double getPrice(){
return price;
}
 public void setPrice(double price){
this.price=price;
}
}