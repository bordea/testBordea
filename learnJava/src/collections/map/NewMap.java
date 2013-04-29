package collections.map;

import java.util.*;

public class NewMap {


    public static void main(String args[]){

        Hashtable<Integer, String> source = new Hashtable<Integer,String>();
        HashMap<Integer, String>  map = new HashMap(source);

        map.put(21, "Twenty One");

        Integer key = 21;
        String value = map.get(key);
        System.out.println("Key: " + key +" value: "+ value);

        map.put(21, "Twenty One");
        map.put(31, "Thirty One");

        Iterator<Integer> keySetIterator = map.keySet().iterator();

        while(keySetIterator.hasNext()){
            Integer key1 = keySetIterator.next();
            System.out.println("key: " + key1 + " value: " + map.get(key));
        }

        System.out.println("Size of Map: " + map.size());
        map.clear();
        System.out.println("Size of Map: " + map.size());

        System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21));
        System.out.println("Does HashMap contains 21 as value: " + map.containsValue(21));
        System.out.println("Does HashMap contains Twenty One as value: " + map.containsValue("Twenty One"));

        boolean isEmpty = map.isEmpty();
        System.out.println("Is HashMap is empty: " + isEmpty);

        Integer key2 = 21;
        Object value2 = map.remove(key2);                                            //remove object from HashMap
        System.out.println("Following value is removed from Map: " + value2);

        map.put(21, "Twenty One");
        map.put(31, "Thirty One");
        map.put(41, "Thirty One");

        System.out.println("Unsorted HashMap: " + map);                              //     This
        TreeMap sortedHashMap = new TreeMap(map);                                    //     sorts
        System.out.println("Sorted HashMap: " + sortedHashMap);                      //     a HahMap

    }
}
