package bigining;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        char c = 'g';
        long lng = (long)i , lng1;
        lng = i;                                   // "Widening," so cast not really required
        lng1 = c;                                  // char attributed to a long variable without a cast
        System.out.println("i = " +i + " lng = " + lng + " lng1 = " + lng1);

        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;                             // A "narrowing conversion". The Cast is required
        System.out.println("lng2 = " + lng2 + " i = " + i);
    }
}
