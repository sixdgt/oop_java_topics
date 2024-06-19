package thirdsem.collection.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> capitals = new ArrayList<>();
        
        capitals.add("Delhi");
        capitals.add("Beijing");
        capitals.add("Thimpu");
        capitals.add("Kathmandu");
        capitals.add("Jakarta");
        capitals.add("Canberra");
        capitals.add("Tokyo");
        
        Iterator itr = capitals.iterator();
        
        while(itr.hasNext()){
            if(itr.next().equals("Kathmandu")){
                System.out.println("Kathmandu is the capital of Nepal");
            }
        }
        
        // the following arraylist can hold any type of data
        ArrayList data = new ArrayList();
        
        data.add("Nepal");
        data.add(1);
        data.add(true);
        
        Iterator itr_obj = data.iterator();
        while(itr_obj.hasNext()){
            System.out.println("Data: " + itr_obj.next());
        }
    }
}
