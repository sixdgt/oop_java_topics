package thirdsem.labsix.multilevel;

public class Bike extends Vehicle{
    public String cc;
    public String bike_type;
    
    public void showBikeDetail(){
        System.out.println("CC: " + this.cc);
        System.out.println("Bike Type: " + this.bike_type);
        // accessing parent property
        this.vehicleInfo();
    }
}
