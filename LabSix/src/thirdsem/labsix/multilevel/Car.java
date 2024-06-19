package thirdsem.labsix.multilevel;

public class Car extends Vehicle{
    public String cc;
    public String wheeler_type;
    public String engine_type;
    
    public void showCarDetail(){
        System.out.println("CC: " + this.cc);
        System.out.println("Wheeler Type: " + this.wheeler_type);
        System.out.println("Engine Type: " + this.engine_type);
        // accessing parent method
        this.vehicleInfo();
    }
}
