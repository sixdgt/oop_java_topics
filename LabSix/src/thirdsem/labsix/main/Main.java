package thirdsem.labsix.main;
/** using import keyword
* here Brand & SmartPhone are in different package so we need to
* import their package
* Note: import packages always at the beginning/top of the program
*/
import thirdsem.labsix.single.Brand;
import thirdsem.labsix.single.SmartPhone;
import thirdsem.labsix.multilevel.Vehicle;
import thirdsem.labsix.multilevel.Car;
import thirdsem.labsix.multilevel.Bike;
import thirdsem.labsix.multilevel.Scooter;

public class Main {
    public static void main(String args[]){
        /**
         * Inheritance Example
         * 1. Single Inheritance
         * creating object of Brand & SmartPhone
         */
        Brand iphone = new Brand();
        /**
         * storing values to attributes
         * here Brand can access self properties & SmartPhone
         * properties since it has inherited SmartPhone
         */
        iphone.setCategory("Top End Phone");
        iphone.brand = "Apple";
        iphone.model = "Iphone 15 Pro Max";
        // accesing method
        iphone.getSmartPhoneDetail();
        
        /**
         * Creating SmartPhone object
         * here SmartPhone can access self properties only
         */
        SmartPhone sp = new SmartPhone();
        sp.setCategory("Andriod Phone");
        System.out.println("Category: " + sp.getCategory());
        
        /**
         * 2. Multi-level Inheritance Example
         * creating objects of classes
         */
        Car c1 = new Car();
        // parent class properties
        c1.brand = "Tesla";
        c1.model = "Model X";
        c1.registration_no = "REG-0214";
        c1.category = "Electric";
        // self properties
        c1.cc = "1200 CC";
        c1.engine_type = "Battery";
        c1.wheeler_type = "Two Wheeler";
        c1.showCarDetail();
    }
}
