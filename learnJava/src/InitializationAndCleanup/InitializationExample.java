package InitializationAndCleanup;

class Depth {}

class Rock {
    Rock() {                                                                    // This is the DEFAULT constructor
        System.out.println("Initializare printr-un contructor simplu ");
    }

    Rock(int i) {                                         // constructor cu un argument de tip int
        System.out.println("Constructor cu un argument " + i + " ");
    }


}

public class InitializationExample {
    Depth d = new Depth();                        // initializing a non-primitive object
    // if we don't initialize d before we try and use the compiler will give us an error called an exception

    public class MethodInit {
        int i = f1();
        int f1() { return 11; }          // we can call a method to provide an initialization value
        // int k = g(i);                    // we can't have this before the  int j = f2 () ;
        int j = f2();
        int k = g(i);                    // we can't have this before the  int j = f2 () ;
        int f2() { return 11; }
        int g(int n) { return n * 10; }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            new Rock();                 // apelarea unui contructor fara nici un argument, apelarea unui DEFAULT Contructor
        }

        for(int i = 0; i < 3; i++)      // apelarea unui contructor fara cu un argument
            new Rock(i);

        int i;
        //i++; // Error --> variable i might not have been initialized


    }
}
