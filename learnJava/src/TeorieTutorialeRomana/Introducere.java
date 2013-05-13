package TeorieTutorialeRomana;

public class Introducere {
}
/*The source file is saved in a file with exension .java
The file that contains the source code of the class must have the same name as the primary class of the application(the class
 with the main method).
At the compilation the apeal is made for the file that contains the main class. A separate file is created by the compiler
 for each class. The extension for these will be .class and they will be placed in the same directory with the main source.
To run this manually we can run the command "java AppName" (note that the .class extension is left out) */

/*  Operatori matematici  + (++), - (--), *. /, %
    Operatori logici and && , or || , not !=
    Operatori relationali <, <=, >, >=, ==, !=

    Data types: aritmethics --> byte, short, int, long, float, double
                character --> char
                logic --> boolean

    Vectors, classes and interfaces are reference types. The value of a variable of this type is simply a reference, a memory address,
that points towards the value or the values represented by that variable.

    The variables can have either a primitive type of data or a reference to an object.
Variable Declaration --> Type variableName
Variable Initialization --> Type variableName = value
Constant Declaration --> final Type variableName

The variables can be of 4 types depending on where they're declared
1. Member Variables --> declared inside a class and visible for all the methods fo that class and for other classes depending on
        their level of access.
2. Local Variables --> declared in a method or inside a block code and they're only visible inside that mothod/block code
3. Methods parameters --> they're visible only inside that method
4. Exception handling parameters
*/

/*
Arrays
1. Delcaring an array
Type [] arrayName;  --> int[] firstOneHundredNumbers
Type arrayName [];  --> String [] numeElevi
2. Instantation --> it's realised through the operator new and it physically allocates the memory for the array.(max no of elements)
arrayName = new Type[Size]
3. Initialization --> optional
Multidimensional Arrays
Type arrayName []

length --> keyword that returns the length of the array

System.arraycopy(x,0,y,0,x.length) --> used for copying arrays

*/