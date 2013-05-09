package HoldingObjects;

import java.util.*;
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
// apples.add(new Orange());      // --> Compile-time error:
        for(int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());

        for(Apple c : apples)                           // cu ajutorul FOREACH
            System.out.println(c.id());
    }
}
