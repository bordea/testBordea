package HashMap;

import java.util.*;

public class IteratorDemo {

    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("Original contents --> ");          // afisare cu iterator
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + "  |  ");
        }
        System.out.println();

        ListIterator litr = al.listIterator();                  //modifica obiectele iterate
        while(litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+  |  ");
        }
        System.out.print("Modified contents --> ");
        itr = al.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element);
        }
        System.out.println();

        System.out.print("ModifiedBackwards --> ");          //afiseaza lista invers
        while(litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element);
        }
        System.out.println();
    }
}
