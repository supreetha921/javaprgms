class WebsiteTester{

public static void main(String a[]){
Website web1=new Website();
web1.websiteId=44;
web1.name="Flipkart";
web1.types="shopping";
System.out.println(web1.webId);
System.out.println(web1.hashCode());

Website web2=new Website();
web1.websiteId=44;
web1.name="Amazon";
web1.types="shopping";
System.out.println(web2.webId);
System.out.println(web2.hashCode());


boolean type=web1.equals(web2);

System.out.println(type);
}
}


