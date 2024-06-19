package thirdsem.unitfour.examples;

public class Main {
    public static void main(String args[]){
        // creating object
        EncapsulationExample ee = new EncapsulationExample();
        // accessing public attributes
        System.out.println(ee.topic);
        System.out.println(ee.faculty);
        
        // accessing protected attributes
        System.out.println(ee.semester);
        // we are able to access semeseter since both 'EncapsulationExample'
        // and 'Main' classes are in same package
        
        // accessing default attributes
        System.out.println(ee.session);
        
        // accessing private attributes
        // we cannot directly access private attributes
//        System.out.println(ee.unit); 
        // if we forcefully try to access private then it will raise Exception
        
        // Note: we can store values in all attributes(public, protected,
        // default) except private attributes
        
        // in order to access and store value in private attributes we need
        // public method which are called access modifier
        
        // accessing private attributes with public method
        System.out.println(ee.getUnit());
        // storing value in private attributes
        ee.setUnit("Unit Five");
        // accesing new value 
        System.out.println("Latest Unit: " + ee.getUnit());
        
        
    }
}
