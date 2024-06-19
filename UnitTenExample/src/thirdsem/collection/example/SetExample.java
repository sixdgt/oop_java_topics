package thirdsem.collection.example;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        Set<String> days = new HashSet<>();
        
        // adding data in set
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        // adding duplicate element in set
        days.add("Sunday");
        
        Iterator itr = days.iterator();
        while(itr.hasNext()){
            System.out.println("Days: " + itr.next());
        }
    }
}
