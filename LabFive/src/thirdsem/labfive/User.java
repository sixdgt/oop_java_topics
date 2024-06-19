package thirdsem.labfive;

public class User {
    // user attributes
    public String full_name;
    public String email;
    public String username;
    public String password;
    public String gender;
    public String country;
    
    /**here we are going to implement constructor overloading
    * parameterised constructor with two parameter
    * value or variable pass inside parenthesis while defining a function
    * or method or constructor is called parameter
    * parameter can be one or more
    */
    /**
     * @param param_email -> '@' is use for annotation in documentation in Java
     * @param param_password
    */
    public User(String param_email, String param_password){
        this.email = param_email;
        this.password = param_password;
    }
    
    // parameterised constructor with one parameter
    public User(String param_email){
        this.email = param_email;
    }
    
    public User(String full_name, String email, String username, String password,
            String gender, String country){
        this.full_name = full_name; // here variable passed as parameter are local
        this.email = email;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }
    
    /**
     * Constructor Overloading: defining multiple constructor with different
     * parameter within same class
     * Constructor Name must be same as class name
     */
    
    // method for User
    // this function will check email availability
    public void checkEmailAvailability(){
        // here this.email is the attribute of class User and we are
        // checking the attribute value with given data
        if(this.email == "dav@gmai.com"){
            System.out.println("Email Exist. Try again with new Email");
        } else {
            System.out.println("Email is unavailable.");
        }
    }
    // this function will check email and password of user
    public void checkCredentials(){
        // here this.email and this.password are attributes of class User
        // checking email and password
        if(this.email == "sagarpant@gmail.com" && this.password == "pant123"){
            System.out.println("User found..");
        } else {
            System.out.println("Invalid Username or Password..");
        }
    }
    
    // checking email, password and username
    public void checkUserData(){
        String email = "sagar@gmail.com";
        String password = "sagar123";
        String username = "sagarhere";
        
        if(this.email == email && this.password == password && 
                this.username == username){
            System.out.println("All match..");
        } else {
            System.out.println("Something is missing");
        }
    }
}
