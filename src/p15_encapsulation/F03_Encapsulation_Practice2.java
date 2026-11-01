package p15_encapsulation;

public class F03_Encapsulation_Practice2 {
    public static void main(String[] args){
        Profile p1 = new Profile("01892145414", "Dhaka", "Khulna");
        System.out.println(p1.getUsername());
        System.out.println(p1.getPhonenumber());
        System.out.println(p1.getPickup());
        System.out.println(p1.getDropoff());
        p1.setPickup("Sylhet");
        System.out.println(p1.getPickup());
    }
}
class Profile{
    private final String username = "ABC";
    private String phonenumber;
    private String pickup;
    private String dropoff;
    public Profile(String phonenumber, String pickup, String dropoff){
        this.phonenumber = phonenumber;
        this.pickup = pickup;
        this.dropoff = dropoff;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public void setPickup(String pickup){
        if(!pickup.equals(dropoff)){
            this.pickup = pickup;
        }
    }
    public void setDropoff(String dropoff){
        if(!dropoff.equals(pickup)){
            this.dropoff = dropoff;
        }
    }

    public String getUsername() {
        return username;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    public String getPickup(){
        return pickup;
    }
    public String getDropoff(){
        return dropoff;
    }

}

