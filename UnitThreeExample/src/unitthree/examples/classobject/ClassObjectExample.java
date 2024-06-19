package unitthree.examples.classobject;

public class ClassObjectExample {
    // main method
    public static void main(String args[]){
        // creating 'Employee' class object
        Employee emp = new Employee();
        // invoking 'Employee' class method with object
        emp.employeeDetail();
        
        // creating 'Vehicle' class object
        Vehicle veh = new Vehicle();
        // invoking 'Vehicle' class method with object
        veh.vehicleDetail(); 
    }
}
