package InitializationAndCleanup;

class Rock {
    Rock() {                                                                    // This is the DEFAULT constructor
        System.out.println("Initializare printr-un contructor simplu ");
    }

    Rock(int i) {                                         // constructor cu un argument de tip int
        System.out.println("Constructor cu un argument " + i + " ");
    }


}

public class InitializationExample {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            new Rock();                 // apelarea unui contructor fara nici un argument, apelarea unui DEFAULT Contructor
        }

        for(int i = 0; i < 3; i++)      // apelarea unui contructor fara cu un argument
            new Rock(i);
    }
}
