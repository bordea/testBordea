package operators;

public class Casting {
    public static void main(String[] args) {
        int i = 200, j = 111,k ;
        long lng = (long)i;
        long lng1 = i;              // "Widening," so cast not really required
        long lng2 = (long)200;      // "Widening," so cast not really required
        lng2 = 200;
        j = (int)lng2;              // A "narrowing conversion" -->  Cast is ALWAYS required
      //  k = lng;        //    --> the compiler gives INCOMPATIBLE TPES error, Required Long Found int
        i = (int)lng1;
    }
}
