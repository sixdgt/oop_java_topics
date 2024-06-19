package thirdsem.labfour;

public class Customer {
    // customer attributes
    public String name;
    public String contact;
    public String email;
    public String address;
    
    // defining non-parameterised constructor
    public Customer(){
        // initializing class attributes
        this.name = "Kapil Sharma";
        this.contact = "8874564545";
        this.email = "kplsharma@gmail.com";
        this.address = "India";
    }
    
    // method that gives customer information
    public void showCustomerRecord(){
        String name = "Hira"; // it is a local variable
        System.out.println("Name: " + this.name); // class variable
        System.out.println("Contact: " + this.contact);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
    }
}
