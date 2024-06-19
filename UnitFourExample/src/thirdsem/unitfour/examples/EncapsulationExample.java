package thirdsem.unitfour.examples;

public class EncapsulationExample {
    // 1. public attributes - can be access in all packages
    public String topic = "Encapsulation Example";
    public String faculty = "BCA";
    
    // 2. protected attributes - can be access only defined package
    protected String semester = "Third Sem";
    
    // 3. private attributes - can be access only within the class
    private String unit = "Unit Four";
    
    // 4. default attributes
    String session = "Morning Session";
    
    /** defining public method to access private attributes 
     * 1. getter() method - to access data of private attributes
     * must be of return type with respect to the datatypes of attribute
     * 2. setter() method - to store data in private attributes
     * must take parameter of same datatype and has return type 'void'
     */
    /**
     * getter method for 'unit'
     * @return String
     */
    public String getUnit(){
        return this.unit;
    }
    
    /**
     * setter method for 'unit'
     * @param param_unit
     */
    public void setUnit(String param_unit){
        this.unit = param_unit;
    }
}
