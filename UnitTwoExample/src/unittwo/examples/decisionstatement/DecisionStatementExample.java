package unittwo.examples.decisionstatement;

public class DecisionStatementExample {

    public static void main(String args[]) {
        /**
         * Decision Statement a. if statement checks the conditional statement
         * is either true or false if the statement is true then only the code
         * inside it is executed syntax if(condition){ block of code }
         */
        int order_code = 45;
        // single condional statement
        if (order_code == 45) {
            System.out.println("Your order code is correct");
        }

        // multiple conditional statement
        double price = 450;
        double discount = 20;
        if (price <= 450 && discount >= 20) {
            System.out.println("You can order the item");
        }

        String name = "DAV";
        if (name != "DAV") {
            System.out.println("My name is DAV");
        }
        /**
         * the value of name is "DAV" we checked it as wrong value with '!='
         * operator so it will not meet the condition of if statement therefore
         * the code inside the if statement will not execute
         */

        /**
         * b. if else statement if the condition do not meet then alternatively
         * the code inside else statement will execute syntax: if(condition){ }
         * else { }
         */
        boolean student_status = true;
        int student_no = 21;
        if (student_status == true && student_no == 12) {
            System.out.println("Student: " + student_no + " is Present");
        } else {
            System.out.println("Student: " + student_no + " is absent");
        }

        // NOTE: if there is any boolean condition or value
        boolean is_present = true;
        // for true condition
        if (is_present) {
            System.out.println("I am present");
        }
        // for false condition
        if (!is_present) {
            System.out.println("I am present");
        } else {
            System.out.println("I am absent");
        }

        /**
         * c. if else if statement checking single output for multiple condition
         * syntax: if(condition){ } else if(condition){ } else if(condition){ }
         * else { }
         *
         * here else{} statement is optional
         */
        int day_no = 5;

        if (day_no == 1) {
            System.out.println("Sunday");
        } else if (day_no == 2) {
            System.out.println("Monday");
        } else if (day_no == 3) {
            System.out.println("Tuesday");
        } else if (day_no == 5) {
            System.out.println("Thursday");
        } else {
            System.out.println("No day found");
        }

        /**
         * d. Nest if statement if statement inside another if statement syntax:
         * if(condition){ if(condition){} } else if(condition){ if(condition){}
         * } else { if(condition){} }
         */
        String username = "dav";
        String password = "12345";
        String usertype = "admin";
        if (username == "dav") {
            if (password == "12345" && usertype == "admin") {
                System.out.println("Welcome to DAV");
            } else {
                System.out.println("Invalid username or password");
            }
        } else {
            System.out.println("User not registered!!");
        }

        /**
         * e. Switch Statement single expression checking with multiple cases
         * syntax: switch(expression){ case 1: block of code; break; default:
         * block of code; break; }
         */
        String gender = "Female";
        switch (gender) {
            case "Female":
                System.out.println("I am a female");
                break;
            case "Male":
                System.out.println("I am a male");
                break;
            case "Others":
                System.out.println("I have different gender");
                break;
            default:
                System.out.println("Please enter correct gender");
                break;
        }
        // excercise
    }
}
