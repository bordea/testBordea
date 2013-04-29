package collections.map;

import java.util.*;

public class TestMap {
    public static void main(String a[]){
        HashMap<Price, String> hashmap = new HashMap<Price, String>();
        hashmap.put(new Price("Colebil", 20), "Colebil");
        hashmap.put(new Price("Aspirina", 40), "Aspirina");
        hashmap.put(new Price("Sirop", 30), "Sirop");
        printMap(hashmap);
        Price key = new Price("Colebil", 20);
        System.out.println("Delete key");
        hashmap.remove(key);
        System.out.println("After the key delete: ");
        printMap(hashmap);
    }

    public static void printMap(HashMap<Price, String> hmap){
        Set<Price> keys = hmap.keySet();
        for(Price p:keys){
            System.out.println(p+" --> " + hmap.get(p));
        }
    }
}


