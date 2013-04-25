package HashMap;

import java.util.*;
class HashMapDemo {
    public static void main(String args[]) {

        HashMap hm = new HashMap();                          // Create a hash map

        hm.put("John Doe", new Double(3434.34));             // Put elements to the map
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Todd Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        Set set = hm.entrySet();                             // Get a set of the entries

        Iterator i = set.iterator();                         // Get an iterator

        while(i.hasNext()) {                                 // Display elements
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = ((Double)hm.get("John Doe")).doubleValue();          // Deposit 1000 into John Doe's account
        hm.put("John Doe", new Double(balance + 1000));
        System.out.println("John Doe's new balance: " +
                hm.get("John Doe"));
    }
}