package Enum;

public class Burrito {
    public enum Spiciness {
        NOT, MILD, MEDIUM, HOT, FLAMING
    }

    Spiciness degree;
    public Burrito(Spiciness degree) { this.degree = degree;}
    public void describe() {                                        // metoda care nu returneaza nimic si printeaza descrierea
        System.out.print("This burrito is ");                       // unui burrito cu ajutorul uni switch
        switch(degree) {
            case NOT: System.out.println("not spicy at all.");
                break;
            case MILD: ;//System.out.println("hot doar cat sa stii ca ii hot ");
            case MEDIUM: System.out.println("a little hot.");
                break;
            case HOT: ;//System.out.println("iute.");
            case FLAMING: ;//System.out.println("iti ia foc gura.");
            default: System.out.println("maybe too hot.");
        }
    }
    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT);
        Burrito greenChile = new Burrito(Spiciness.MEDIUM);
        Burrito jalapeno = new Burrito(Spiciness.HOT);
        //Burrito ceapa = new Burrito(Spiciness.MILD);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
        //ceapa.describe();

    }
}
