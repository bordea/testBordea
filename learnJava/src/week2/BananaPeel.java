package week2;

class Banana { void peel(int i) { /* ... */ } }     // aceasta e singura posibilitate in cazul de fata in ceea ce priveste accesul clasei
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(),
               b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
