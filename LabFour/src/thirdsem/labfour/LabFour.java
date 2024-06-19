package thirdsem.labfour;

public class LabFour {
    // main method for lab four
    public static void main(String args[]){
        /** program will initiate from this method
        * creating customer object
        * here customer object is being created independently so it will not
        * be shown in order
        */
        Customer cus = new Customer();
        // invoking class method with object which will show the customer's detials
        cus.showCustomerRecord();
        // this will show default value initialized inside customer
        // constructor
        
        // creating order object
        Order odr = new Order();
        /** invoking order details method which has its own customer object
        * that will carry customer's details that were initialized in the
        * constructor
        */
        odr.giveOrderRecord();
    }
}
