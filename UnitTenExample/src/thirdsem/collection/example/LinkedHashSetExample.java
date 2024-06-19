package thirdsem.collection.example;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> gender = new LinkedHashSet<>();
        
        // adding data to set
        gender.add("Male");
        gender.add("Female");
        gender.add("Other");
        
        Iterator itr = gender.iterator();
        while(itr.hasNext()){
            System.out.println("Gender: " + itr.next());
        }
    }
}
