package HoldingObjects;

import java.util.*;

public class SimpleSet {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < 10; i++){
            s.add(i);                                        // --> Autoboxing
            s.add(i);                                        // chiar daca incercam sa adaugam duplicate Set nu le adauga
        }
        for(Integer i : s){
            System.out.print(i + ", ");
        }
    }
}
//Exercise 2: (1) Modify SimpleCollection.java to use a Set for c.
