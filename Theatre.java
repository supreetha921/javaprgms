class Theatre
{
    String name;
    String location;
    boolean isBookingAvailable;
    int totalNoOfSeats;
    int noOfscreens;
    int showsPerDay;
    
    public Theatre() {
        this("Sangam", "Mysore", true, 961, 1, 4);
        System.out.println("Theatre with zero parameters");
    }
    
    public Theatre(String name,String location,  boolean isBookingAvailable, 
 int totalNoOfSeats,  int noOfscreens,  int showsPerDay) {
        System.out.println("Theatre with  parameters");
        this.name = name;
        this.location = location;
        this.isBookingAvailable = isBookingAvailable;
        this.totalNoOfSeats = totalNoOfSeats;
        this.noOfscreens = noOfscreens;
        this.showsPerDay = showsPerDay;
        System.out.println( this.name+" "+ this.location+" "+ this.isBookingAvailable+" "+ this.totalNoOfSeats+" "+ this.noOfscreens+" "+ this.showsPerDay);
    }
    
    public void entertainment() {
        System.out.println("Entertainment.....Entertainment and Entertainment");
    }
    
    public void entertainment(String popcorn) {
        System.out.println("Enjoying with friends with"+popcorn);
    }
}