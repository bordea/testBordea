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

        for (String s: str) {
            printElement(str);
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

   //     printList(str);

        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<String>();

        String theElement = addAndReturn(stringElement, stringList);


        Integer integerElement = new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();

        Integer theElement = addAndReturn(integerElement, integerList);

    }

    public static <E> void printElement(E e) {
        System.out.println(e);
    }

  /*  public static <L> void printList(L l, List<L> lista) {
        for (L theList : lista){
            System.out.println();
        }
    }      */

    <R> addAndReturn(R r, List<R> lista){

    }


}
