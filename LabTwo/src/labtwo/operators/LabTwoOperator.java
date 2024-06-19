package labtwo.operators;

public class LabTwoOperator {
    public static void main(String args[]){
        // 1. Assignment Operator
        System.out.println("Assignment Operator Example:");
        
        String name = "DAV College";
        String session = "LAB Two | OOP in JAVA";
        
        System.out.println("Name: " + name);
        System.out.println("Session: " + session);
        
        int num = 12;
        System.out.println("Value of num before: " + num);
        
        num += 23; // num = num + 23 i.e num = 12 + 23
        System.out.println("Value of num after: " + num);
        
        int status_code = 5;
        System.out.println("Status Code Before: " + status_code);
        
        status_code *= 12; // status_code = 5 * 12 
        System.out.println("Status Code After: " + status_code);
        System.out.println("");
        
        // 2. Arithmetic Operator
        System.out.println("Arithmetic Operator Example..");
        
        double price = 1547.78;
        double discount = 120.45;
        System.out.println("Item Price: " + price);
        System.out.println("Discount: " + discount);
        
        double vat = price * 0.13; // multiplication
        System.out.println("VAT Amount: " + vat);
        
        double total = price - discount + vat; // addition & subtraction
        System.out.println("Total: " + total);
        
        double mod_eg = price % 2; // modulas
        System.out.println("Modulas Example: " + mod_eg);
        System.out.println("");
       
        // 3. Comparative Operator
        System.out.println("Comparative Operator Example..");
        
        String email = "dav@gmail.com";
        int reg_no = 45;
        
        System.out.println("Equals To == : " + email == "dav@gmail.com");
        System.out.println("Greater Than > :" + (reg_no > 40));
        System.out.println("Lesser Than < :" + (reg_no < 40));
        System.out.println("Greater Than Equals To >= :" + (reg_no >= 45));
        System.out.println("Lesser Than Equals To <= :" + (reg_no <= 45));
        System.out.println("Not equals to != : " + (email != "dav@gmail.com"));
        
        // 4. Logical Operator
        /**a. logical AND. Symbol: &&
         * all conditions must be true
         * b. logical OR. Symbol: ||
         * if any of the condition is true then returns true
         */
        String username = "davuser";
        String password = "dav123";
        boolean status = true;
        String usertype = "ADMIN";
        System.out.println("");
        System.out.println("Logical Operator Example:");
        
        System.out.println("Logical AND &&: " + 
                (username == "DAV" && password == "dav123")); // false
        System.out.println("Logical OR ||: " +
                (username == "DAV" || password == "dav123")); // true
        System.out.println("Logical AND &&: " +
                (status != false && usertype == "ADMIN")); // true
        System.out.println("Logical OR ||: " + 
                (!status == true || usertype == "USER")); // false
        /**
         * here 'status' = true so statement 'status == true' returns true
         * but '!' logical NOT is used before the statement so it makes the
         * statement 'false' because logical NOT reverse the output
         */
        System.out.println("");
        
        // 5. Shift Operator
        /**
         * a. left shift <<
         * b. right shift >>
         */
        System.out.println("Shift Operator Example:");
        
        int num_one = 13;
        int num_two = 15;
        System.out.println("Number One Before: " + num_one);
        System.out.println("Left Shift: " + (num_one << 2));
        System.out.println("Number One After: " + num_one);
        
        System.out.println("Number Two Before: " + num_two);
        System.out.println("Right Shift: " + (num_two >> 3));
        System.out.println("Number Two After: " + num_two);
        System.out.println("");
        
        // 6. Bitwise Operator
        /**
         * a. Bitwise AND. Symbol &
         * b. Bitwise OR. Symbol |
         * c. Bitwise Exclusive OR. Symbol ^
         */
        System.out.println("Bitwise Operator Example:");
        
        int value_one = 13;
        int value_two = 15;
        int value_three = 16;
        int value_four = 17;
        System.out.println("Value One Before: " + value_one);
        System.out.println("Value Two Before: " + value_two);
        System.out.println("Bitwise AND: " + (value_one & value_two));
        System.out.println("Value One After: " + value_one);
        System.out.println("Value Two After: " + value_two);
        
        System.out.println("Value Three Before: " + value_three);
        System.out.println("Value Four Before: " + value_four);
        System.out.println("Bitwise OR: " + (value_three | value_four));
        System.out.println("Value Three Before: " + value_three);
        System.out.println("Value Four Before: " + value_four);
        
        System.out.println("Bitwise Exclusive OR: " + 
                (value_one ^ value_two));
        System.out.println("");
        // 7. ternary operator
        
        System.out.println("Ternary Operator Example:");
        boolean is_active = true;
        System.out.println("Check User: " + (is_active? true: false));
        
        int grade = 5;
        int tag = 1;
        System.out.println("Grade & Tag: " + (grade + tag ==6?6: 7));
        
        String student_sem = "Sem II";
        System.out.println("Student Sem: " + 
                (student_sem == "Sem I"? "Sem I": "Sem II"));
    }
}
