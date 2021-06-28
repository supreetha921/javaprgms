class Novels
{
    String name;
    String Authorname;
    boolean isAvailableOnline;
    String type;
    
    public Novels() {
        this("Think like monk", "Jay shetty", true, "Self-help");
        System.out.println("Novels with zero parameters");
    }
    
    public Novels(String name,String Authorname,  boolean isAvailableOnline, 
 String type) {
        System.out.println("Beach with  parameters");
        this.name = name;
        this.Authorname = Authorname;
        this.isAvailableOnline = isAvailableOnline;
        this.type= type;
        
        System.out.println( this.name+" "+ this.Authorname+" "+ this.isAvailableOnline+" "+ 
  this.type);
    }
    
    public void  ideas() {
        System.out.println("connect the ideas....");
    }
    
    public void  ideas(String motivation) {
        System.out.println("read books to"+ motivation);
    }
}