package thirdsem.collection.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        
        // adding elements to arraylist
        cities.add("Kathmandu");
        cities.add("Lalitpur");
        cities.add("Biratnagar");
        cities.add("Pokhara");
        cities.add("Dharan");
        
        // creating iterator object
        Iterator itr = cities.iterator();
        
        System.out.println("Iteration: " + itr);
        
        /**
         * iterating collection object
         * hasNext() - return true if the element is available
         * next() - return element from the iterator object
         */
        while(itr.hasNext()){
            System.out.println("Cities of Nepal: " + itr.next());
        }
        
        // removing element from arraylist object
        cities.remove("Dharan");
        Iterator itr_1 = cities.iterator();
        
        System.out.println("Elements after removal");
        while(itr_1.hasNext()){
            System.out.println("Cities of Nepal: " + itr_1.next());
        }
    }
}
