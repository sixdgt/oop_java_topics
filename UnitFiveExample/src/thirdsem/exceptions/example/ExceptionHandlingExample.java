package thirdsem.exceptions.example;

public class ExceptionHandlingExample {
    public static void main(String args[]) {
        System.out.println("Exception Example");
        int num_one = 100;
        int num_two = 0;
        try{
            System.out.println("Result: " + num_one / num_two);
        } catch (Exception e){
            System.out.println("Message: " + e.getMessage());
        }        
        System.out.println("Trying out try-catch block");
        
        // example two
        System.out.println("Exception Handling Exampe Two:");
        System.out.println("Custom Message");
        try{
            String address = "Lalitpur";
            System.out.println(address.charAt(15));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Custom Message: Length of string is lesser than 15");
            System.out.println("Message: " + e.getMessage());
        }
        
        // example three: multiple catch clauses
        try {
            int len = args.length; // it will count the length of args of main method
            int result = 234/len;
        
            System.out.println("Arguments Length: " + result);
        
            String mountains[] = {"Mt. Everest", "Mt. Annapurna", "Mt. Machchapurchhre"};
            System.out.println(mountains[12]);
        } catch (ArithmeticException e){
            System.out.println("Message: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Message: " + e.getMessage());
        }        
        
        // checking multiple exceptions 
        String character_name = "Mr. Rajesh Hamal";
        try{
            System.out.println(character_name.charAt(50));
            int num = 100 / 0;
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Message One: " + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Message Two: " + e.getMessage());
        }
        
        System.out.println("Trying out string method with Exception");
        try{
        int order[] = {1, 2, 3, 4, 5};
        System.out.println(order[15]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
}
