package thirdsem.labsix.multilevel;

public class Vehicle {
    // attributes of Vehicle
    public String category;
    public String registration_no;
    public String brand;
    public String model;
    
    public void vehicleInfo(){
        System.out.println("Category: " + this.category);
        System.out.println("Registration: " + this.registration_no);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }
}
