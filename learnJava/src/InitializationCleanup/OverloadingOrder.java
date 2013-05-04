package InitializationCleanup;

public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s) {                            //ordinea in care apar argumentele diferentiaza doua metode care
        System.out.println("int: " + i + ", String: " + s);     //care au aceleasi argumente dar in ordine diferita.
    }
    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
