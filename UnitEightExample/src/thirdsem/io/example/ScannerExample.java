package thirdsem.io.example;
//importing scanner package
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // taking string input
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your Name: " + name);
        
        // taking int input
        System.out.println("Hello! " + name);
        System.out.println("Please enter item price: ");
        int price = sc.nextInt();
        System.out.println("Please enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Your total price is: " + price * quantity);
    }
}
