package unitthree.examples.methods;

public class UserAccount {
    // attributes
    public int acc_no;
    public String acc_holder_name;
    public String acc_type;
    public double total_balance;
    
    // constructor with parameters
    public UserAccount(int acc_no, String name, String acc_type, double balance){
        this.acc_no = acc_no;
        this.acc_holder_name = name;
        this.acc_type = acc_type;
        this.total_balance = balance;
    }
    
    // methods
    // method with parameter and return type
    public double getUserBalance(int acc_no){
        if(this.acc_no == acc_no){
            return this.total_balance;
        }
        return 0.00;
    }
    
    public void getAccountDetail(int acc_no){
        if(this.acc_no == acc_no){
            System.out.println("Name: " + this.acc_holder_name);
            System.out.println("Acc Type: " + this.acc_type);
            System.out.println("Balance: " + this.total_balance);
        } else {
            System.out.println("Account not found");
        }
    }
    
    // main method
    public static void main(String args[]){
        // creating user object
        UserAccount ua = new UserAccount(5, "Jeson Gurung", "saving", 150000.00);
        // calling method with correct account number as arg
        int acc_no = 5;
        // we can use method with return type in multiple ways
        // 1. storing the return value, make sure its data type
        // here getUserBalance() returns double so that we define balance double
        double balance = ua.getUserBalance(acc_no);
        System.out.println("Your Balance: " + balance);
        
        // 2. directing printing the return value
        System.out.println("Your current available balance is: " 
                + ua.getUserBalance(acc_no));
        
        // getAccountDetail() is a void method that means we cannot print it
        ua.getAccountDetail(acc_no);
        
        // calling method with incorrect account number as arg
        acc_no = 6;
        System.out.println("Your current available balance is: " 
        + ua.getUserBalance(acc_no));
        ua.getAccountDetail(acc_no);
    }
}
