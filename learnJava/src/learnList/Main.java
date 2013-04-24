package learnList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        String[] arrayDeString = new String[10];  // asata ii un sarray de string, de lungime fixa 10
//        arrayDeString[0] = 1;

        // limitari ... Array out of bounds

        ArrayList<String> listOfString = new ArrayList<String>();
        listOfString.add("radu");
        listOfString.add("cristi");
//        listOfString.add(1);

        System.out.println(listOfString.size());

        for(int i=0;i<listOfString.size(); i++){
            String currentElem = listOfString.get(i);
            print(currentElem);
        }

        ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
        listOfInteger.add(2);
        listOfInteger.add(13);
        listOfInteger.add(1000);
//        listOfInteger.add(1);

        System.out.println(listOfInteger.size());

        for(int i=0;i<listOfInteger.size(); i++){
            Integer currentElem = listOfInteger.get(i);
            print(String.valueOf(currentElem));
        }
    }

    private static void print(String mes){
        System.out.println(mes);
    }
}
