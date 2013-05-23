package Generice;

class Automobile{}

public class Holder3<T> {

    private T a;
    // Această variabilă de tip poate fi folosită oriunde în cadrul clasei şi peste tot va avea înţelesul tipului
    // ce va fi dat ca parametru la instanţierea clasei.
    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {

        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
    //  Folosirea unui tip generic se mai numeşte şi invocare a unui tip parametrizat.
        Automobile a = h3.get(); // No cast needed
        System.out.println(a);
        // h3.set("Not an Automobile");             // Error
        // h3.set(1);                               // Error
    }
}
