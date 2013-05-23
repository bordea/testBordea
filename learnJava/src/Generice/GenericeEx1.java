package Generice;
import java.util.*;

public class GenericeEx1 {
    public static void main(String [] args){
        List<String> str = new ArrayList<String>();
        str.add("Clasele ");
        str.add("Generice ");
        str.add("Sunt ");
        str.add("Viitorul ");
        str.add("2001");

        String myString = str.get(0);
        System.out.println(myString);

        for (Iterator<String> iter = str.iterator(); iter.hasNext();) {
            String s = iter.next();
            System.out.print(s);
        }

        for (String s: str) {
            System.out.println(s);
        }

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        int sum = 0;
        for (int i : ints) {
            sum += i;
            System.out.println(sum);
        }

    }
}
