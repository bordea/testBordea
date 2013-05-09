package HoldingObjects;

import java.util.*;
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}
class Orange {}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());

        apples.add(new Orange());                       // nimic nu ne impiedica sa adaugam orange la apple
        for(int i = 0; i < apples.size(); i++){
            ((Apple)apples.get(i)).id();                // eroarea e detectata doar la run time
        }
    }
}
