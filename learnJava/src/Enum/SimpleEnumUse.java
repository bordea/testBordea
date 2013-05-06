package Enum;

public class SimpleEnumUse {
    public enum Spiciness {
        NOT, MILD, MEDIUM, HOT, FLAMING
    }

    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for(Spiciness s : Spiciness.values()){                   // for s ia valoarea fiecarei constante din enum-ul Spiciness pe rand
            System.out.println(s + ", ordinal " + s.ordinal());
        }

    }
}
