package Generice;

import java.util.*;

public class GenericTypes {
    void printList(List<String> list) {

        for(String name : list) {
            System.out.println(name);
        }
    }

    List<String> getArrayList() {
        return new ArrayList<String>();
    }

    public static void main(String... args) {

        GenericTypes gt = new GenericTypes();

        List<String> people = gt.getArrayList();
        people.add("Tata");
        people.add("Mama");
        people.add("Cristi");
        people.add("Radu");
        people.add("Dana");

        gt.printList(people);
    }
}
