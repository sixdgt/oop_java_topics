package thirdsem.labfour;

public class Order {
    // order attributes
    public String order_code;
    public String order_status;
    public String order_date;
    public double total_price;
    
    // defining order's constructor
    public Order(){
        this.order_code = "ODR-024-03-4554";
        this.order_date = "2024/03/13";
        this.order_status = "Processing";
        this.total_price = 4500.00;
    }
    
    // defining method that gives the record of order
    public void giveOrderRecord(){
        /** creating customer object in order to manage memory
        * because whenever this method is invoked then only
        * object of customer will be created
        * since customer orders the product so passing
        * customer's object here and it will carry the properties
        * of customer for order
        */
        Customer obj_customer = new Customer();
        // storing value to class attributes via class object
        obj_customer.name = "Jeson Gurung";
        obj_customer.email = "jsongrg@gmail.com";
        obj_customer.contact = "987644121";
        obj_customer.address = "Lalitpur";
        
        // order details
        System.out.println("Order Code: " + this.order_code);
        System.out.println("Order Date: " + this.order_date);
        System.out.println("Order Status: " + this.order_status);
        
        System.out.println("Customer Details for Order");
        // accessing customer attributes with customer object
        System.out.println("Name: " + obj_customer.name);
        System.out.println("Contact: " + obj_customer.contact);
        System.out.println("Address:" + obj_customer.address);
        System.out.println("Email: " + obj_customer.email);
    }
}
