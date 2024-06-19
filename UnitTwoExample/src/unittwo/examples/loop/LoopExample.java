package unittwo.examples.loop;

public class LoopExample {
    public static void main(String args[]){
        // for loop example
        System.out.println("For Loop Example:");
        System.out.println("");
        
        for(int i = 0; i < 10; i++){
            System.out.println("Do not talk too much");
        }

        // counting the loop with counter
        int count = 1;
        for(int i = 0; i < 10; i++){
            System.out.println("Counter: " + count);
            count++;
        }

        for(int i = 1; i <= 10; i++){
            System.out.println("Hello Nepal!!");
        }
        
        // we can also put certain condition inside our loop
        int counter = 1;
        for(int i = 0; i < 15; i++){
            System.out.println("Counter Value: " + counter);
            if(counter == 9){
                System.out.println("Found");
                break;
            }
            counter++;
        }
        
        // 2. while loop
        // loop will execute only if the condition is true
        int num = 0;
        
        // to stop infinite loop we can use 'break' statement
        while (num == 0){
            System.out.println("Infinite Loop");
            break;
            // here the loop will execute only once
        }
        
        // checking while loop inside for loop
        for(int i = 0; i < 10; i++){
            while(i < 5){
                System.out.println("While loop");
                i += 2;
            }
            System.out.println("Value of i: " + i);
        }
        
        // assignment one: write minimum 6 examples for all loops
        // 1. for loop -> 6 examples
        // 2. while loop -> 6 examples
        // 3. do while loop -> 6 examples
        // Deadline: Feb 29th 2024
    }
}
