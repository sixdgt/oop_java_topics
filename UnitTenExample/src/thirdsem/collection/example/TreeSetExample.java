package thirdsem.collection.example;

import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> address = new TreeSet<>();
        
        // adding elements in treeset
        address.add("Kathmandu");
        address.add("Pokhara");
        address.add("Biratnagar");
        address.add("Lalitpur");
        
        Iterator itr = address.iterator();
        while(itr.hasNext()){
            System.out.println("Address: " + itr.next());
        }
    }
}
