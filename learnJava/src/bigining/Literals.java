package bigining;
//Exercise 8: (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results.
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;                      // Hexadecimal (lowercase)               // 0x or 0X is hexadecimal
        System.out.println("i1: " + Integer.toBinaryString(i1));
        long j1 = 0xcdf;                                                             //Ex 8
        System.out.println("j1: " + Long.toBinaryString(j1));

        int i2 = 0X2F;                      // Hexadecimal (uppercase)
        System.out.println("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177;                      // Octal (leading zero)                  // 0 is octal
        System.out.println("i3: " + Integer.toBinaryString(i3));
        long j3 = 0111;                                                              // Ex 8
        System.out.println("j3: " + Long.toBinaryString(j3));

        char c = 0xffff;                    // max char hex value
        System.out.println("c: " + Integer.toBinaryString(c));

        byte b = 0x7f;                      // max byte hex value
        System.out.println("b: " + Integer.toBinaryString(b));

        short s = 0x7fff;                   // max short hex value
        System.out.println("s: " + Integer.toBinaryString(s));

        long n1 = 200L; // long suffix                                                 // L or L for Long
        System.out.println("n1: " + Long.toBinaryString(n1));
        long n2 = 200l; // long suffix (but can be confusing)
        long n3 = 200;
        float f1 = 1;                                                                   // f or F for Float
        float f2 = 1F; // float suffix
        float f3 = 1f; // float suffix
        double d1 = 1d; // double suffix                                                // d or D for double
        double d2 = 1D; // double suffix
// (Hex and Octal also work with long)
    }
}