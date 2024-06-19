package thirdsem.collection.example;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> lakes = new LinkedList<>();
        
        // adding elements in linkedlist
        lakes.add("Phewa");
        lakes.add("Rara");
        lakes.add("Tilicho");
        lakes.add("Begnas");
        
        Iterator itr = lakes.iterator();
        while(itr.hasNext()){
            System.out.println("Lakes: " + itr.next());
        }
        
        // adding element in specific index
        lakes.add(2, "Sheyphoksundo");
        lakes.add(4, "Rara"); // adding duplicate element
        // note: must be valid index
        try{
            lakes.add(10, "Talbarahi"); // we cannot add index out of range
        } catch(IndexOutOfBoundsException e){
            System.out.println("Message: " + e.getMessage());
        }
        Iterator itr_1 = lakes.iterator();
        while(itr_1.hasNext()){
            System.out.println("Lakes After New Element: " + itr_1.next());
        }
    }
}
