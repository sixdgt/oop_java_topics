package thirdsem.exceptions.example;

public class ThrowExceptionExample {
    public static void showMessage(){
        try {
            System.out.println("Message: Java is a OOP");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Message: " + e.getMessage());
        } finally {
            System.out.println("I am trying to handle NullPointerExeception");
        }
    }
    
    public static void main(String args[]){
        try {
             // it is a static method so we can call it directly
            showMessage();
        } catch (NullPointerException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
}
