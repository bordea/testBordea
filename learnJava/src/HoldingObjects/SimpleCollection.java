package HoldingObjects;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            c.add(i);                                        // --> Autoboxing
        }
        for(Integer i : c){
            System.out.print(i + ", ");
        }
    }
}
//Exercise 2: (1) Modify SimpleCollection.java to use a Set for c.
//Exercise 3: (2) Modify innerclasses/Sequence.java so that you can add any number of elements to it.