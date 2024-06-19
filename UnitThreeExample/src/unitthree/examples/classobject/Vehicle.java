package unitthree.examples.classobject;

public class Vehicle {
    // attributes
    public String brand = "Tesla";
    public String manufacture = "USA";
    public String color = "White";
    public String model = "Model X";
    
    // method
    public void vehicleDetail(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Manufacture: " + this.manufacture);
        System.out.println("Color: " + this.color);
        System.out.println("Model: " + this.model);
    }
}
