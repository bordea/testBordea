package bigining;

// Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing.

class Letter {
char c;
}

public class PassObject {
    static void f(Letter y) {                        // clasa schimba obiectul in afara ei
    y.c = 'z';
     }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);                                        // se trimite x la clasa f si revine schimbat din a in z
        System.out.println("2: x.c: " + x.c);
    }
}
