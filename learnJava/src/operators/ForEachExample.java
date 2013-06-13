package operators;

import java.util.*;

public class ForEachExample {

    public static void main  (String args[]){
        int[] a={1,2,3,4,5,6,7,8,9,0};
        for(int i : a){
            System.out.println(i);
        }


        Set<String> exemplu = new HashSet<String>();
        exemplu.add("Programare");
        exemplu.add("Java");
        exemplu.add("De");
        exemplu.add("Placere");

        for(String s : exemplu){
            System.out.println(" Foreach for Set --> " + s);
        }
    }
}
