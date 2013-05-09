package Final;

class SmallBrain {}
final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {System.out.println("f()");}
}                                         // Daca incercam sa extindem clasa finala Dinosaur
//! class Further extends Dinosaur {}     // --> EROARE : Cannot extend final class ‘Dinosaur’
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
        System.out.println(n.j);
    }
}

