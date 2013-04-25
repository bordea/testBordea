package learnInterface;

import java.util.ArrayList;

public class ReplaceElementAtSpecifiedIndex {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1st Element");
        arrayList.add("2nd Element");
        arrayList.add("3rd Element");
        for(int index=0; index < arrayList.size(); index++)
            System.out.println(arrayList.get(index));

// To replace an element at the specified index of ArrayList use Object set(int index, Object obj) method.
// This method replaces the specified element at the specified index in theArrayList and returns the element previously
// at the specified position.
        arrayList.set(1,"REPLACED ELEMENT");

        System.out.println("ArrayList after the replacement");

        for(int index=0; index < arrayList.size(); index++)
            System.out.println(arrayList.get(index));

    }

}
