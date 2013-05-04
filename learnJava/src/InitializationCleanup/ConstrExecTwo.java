//Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message.
// Create an object of this class.

package InitializationCleanup;

public class ConstrExecTwo {
    public static void main(String [] args){
        DefaultConstructor dc = new DefaultConstructor();
//Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a String argument and prints
// it along with your message.
        DefaultConstructor sc= new DefaultConstructor("Example");
    }

    private static void dc() {
    }
}
