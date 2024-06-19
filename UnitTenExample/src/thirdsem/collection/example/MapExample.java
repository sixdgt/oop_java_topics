package thirdsem.collection.example;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> item = new HashMap<>();
        
        // adding data in map
        item.put(1, "Keyboard");
        item.put(2, "Mouse");
        item.put(3, "Mouse Pad");
        item.put(4, "Screen Protector");
        item.put(5, "Keypad Cover");
        
        // accessing data from map
        for(Map.Entry m:item.entrySet()){
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        
            if(m.getValue().equals("Mouse")){
                System.out.println("Is available");
            }
        }
        
        // setting string key
        Map<String, String> code = new HashMap<>();
        code.put("Nepal", "NP");
        code.put("India", "IN");
        code.put("United_Kingdom", "UK");
        code.put("China", "CN");
        code.put("Malaysia", "ML");
        System.out.println("Data before");
        for(Map.Entry m:code.entrySet()){
            System.out.println("Country: " + m.getKey() + " Code: " + m.getValue());
        }
        
        // updating data of map with key. Key must be available
        code.put("China", "CH");
        System.out.println("Data after");
        for(Map.Entry m:code.entrySet()){
            System.out.println("Country: " + m.getKey() + " Code: " + m.getValue());
        }
        
        // removing data of map with key. Key must be available
        code.remove("United_Kingdom"); // we can only pass key
        System.out.println("Data after removing one item");
        for(Map.Entry m:code.entrySet()){
            System.out.println("Country: " + m.getKey() + " Code: " + m.getValue());
        }
        
    }
}
