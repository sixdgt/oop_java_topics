package thirdsem.labfive;

public class LabFiveMain {
    //main method
    public static void main(String args[]){
        /**creating User class object with different constructors
        * Arguments: variable or value pass inside parenthesis while invoking
        * constructor, method or function
        */
        User u1 = new User("sagarpant@gmail.com"); // with single parameter
        System.out.println("User One Email: " + u1.email);
        
        User u2 = new User("jesongurung@gmail.com", "json123"); // with two parameters
        System.out.println("User Two Email: " + u2.email);
        System.out.println("User Two Password: "+ u2.password);
        User u4 = new User("sagarpant@gmail.com", "pant123");
        
        // calling credentials checking method for user object two
        u2.checkCredentials();
        u4.checkCredentials();
        User u3 = new User("Dhirendra Tripathi", "dt@gmail.com", "userdt",
        "123dt", "male", "Nepal"); // with multiple parameters
        System.out.println("User Three Full Name: " + u3.full_name);
        System.out.println("User Three Email: " + u3.email);
    }
}
