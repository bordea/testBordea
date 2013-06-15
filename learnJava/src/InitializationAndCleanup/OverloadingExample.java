package InitializationAndCleanup;

class Chiatra {
    int weight;
    Chiatra() {
        System.out.println("Am creat o chietricica foarte mica ");
        weight = 0;
    }

    Chiatra(int i) {
        weight = i;
        System.out.println("Am creat o chiatra cu greutatea de " + i + " grame ! How impressed are you, eh? " + i);
    }

    void details(){
        System.out.println("Piatra are " + weight + " kilograme ! ");
    }

    void details(String s){
        System.out.println(s + " : Piatra are " + weight + " kilograme ! ");
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++){
            new Chiatra();
        }

        for(int i = 0; i < 4; i++){
            new Chiatra(i);
        }

        for(int i = 0; i < 5; i++) {
            Chiatra ch = new Chiatra(i);
            ch.details();
            ch.details("METODA OVERLOAD");
        }
    }


}