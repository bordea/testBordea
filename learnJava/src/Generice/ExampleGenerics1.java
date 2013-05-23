package Generice;

public class ExampleGenerics1 {

    // generic method printArray
    public static < E > void printArray( E[] inputArray ){
      // 1. Fiecare metoda generica are o sectiune cu tipul parametrului intre <> si este intotdeauna inaintea tipului returnat
      // 2. Orice sectiune in care se declara parametri ttip va avea , intre parametri. Un parametru tip se mai numeste
      // variabila tip --> specifica generic type name
      // 3. Type parametrii pot fi folositi in declaratia tipului returnat si totodata pot sa fie locul de stocare pentru
      // argumentele transmise metodei generice, care se mai numesc type arguments(argumente tip)
      // 4. Corpul unei metode este declarat ca orice alta metoda. Type parameters pot reprezenta doar referinte tip si
      // nicidecum primitive.
        // Display array elements
        for ( E element : inputArray ){
            System.out.println(element );
        }
        System.out.println();
    }
/*
    A generic method's body is declared like that of any other method. Note that type parameters can represent only reference
    types not primitive types (like int, double and char).

  */
    public static void main( String args[] ) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
    }
}
