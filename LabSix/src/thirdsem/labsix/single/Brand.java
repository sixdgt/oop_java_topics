package thirdsem.labsix.single;

public class Brand extends SmartPhone{
    public String model;
    public String brand;
    
    public void getSmartPhoneDetail(){
        System.out.println("Model: " + this.model);
        System.out.println("Brand: " + this.brand);
        // accessing parent property within child class method
        System.out.println("Category: " + this.getCategory());
    }
}
