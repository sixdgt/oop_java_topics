package unitthree.examples.classobject;

public class Employee {
    // class attributes
    public int emp_no = 45;
    public String name = "Hira Pradhan";
    public String email = "hirap@gmail.com";
    public String gender = "Female";
    
    // class method
    public void employeeDetail(){
        /** while using class attributes inside method we need to
        * use 'this' keyword.
        * 'this' keyword indicates that the attributes and methods
        * belong to the same class they are defined under.
        */
        System.out.println("Name: " + this.name);
        System.out.println("Employee Number: " + this.emp_no);
        System.out.println("Email: " + this.email);
        System.out.println("Gender: " + this.gender);
    }
}   
