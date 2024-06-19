package thirdsem.labsix.multilevel;

public class Scooter extends Vehicle{
    public String cc;
    public String color;
    
    public void showScooterDetail(){
        System.out.println("CC: " + this.cc);
        System.out.println("Color: " + this.color);
        // accessing parent method
        this.vehicleInfo();
    }
}
