package unittwo.examples.keywords;

public class KeywordExample {
    public static void main(String args[]){
        /**
         * Keywords Example
         * class, int, double, main, case, try, catch etc.
         */
        
        // int class = 45;
        // here `class` is a keyword so we cannot use it as identifier
        
        // here is the example of identifier with datatype that works
        // perfectly
        int visitor_code = 98;
        System.out.println("Code: " + visitor_code);
        
        // exercise
        // define yourself with five variables and display it in console
        
        // name, reg_no, college_name, stream, semester
        String name = "Bibek Tripathi";
        int reg_no = 46902114;
        String college_name = "DAV College";
        String stream = "BCA | Humanities";
        String semester = "Third Sem";
        String email = "bibektripathi@gmail.com";
        String address = "Kalanki";
        int contact = 98764231;
        String gender = "Male";
        String blood_group = "A+";
        
        System.out.println("Name: " + name);
        System.out.println("Registration No :" + reg_no);
        System.out.println("College :" + college_name);
        System.out.println("Stream :" + stream);
        System.out.println("Semester :" + semester);
        System.out.println("Email :" + email);
        System.out.println("Address :"+ address);
        System.out.println("Contact :" + contact);
        System.out.println("Gender :" + gender);
        System.out.println("Blood Group :" + blood_group);
    }
}
