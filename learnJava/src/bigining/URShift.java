package bigining;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println("i= " + i + " ; result -->" + Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println("i= " + i + " ; result -->" + Integer.toBinaryString(i));

        long l = -1;
        System.out.println("l= " + l + " ; result -->" + Long.toBinaryString(l));
        l >>>= 10;
        System.out.println("l= " + l + " ; result -->" + Long.toBinaryString(l));

        short s = -1;
        System.out.println("s= " + s + " ; result -->" + Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println("s= " + s + " ; result -->" + Integer.toBinaryString(s));

        byte b = -1;
        System.out.println("b= " + b + " ; result -->" + Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println("b= " + b + " ; result -->" + Integer.toBinaryString(b));
        b = -1;
        System.out.println("b= " + b + " ; result -->" + Integer.toBinaryString(b));
        System.out.println("b>>>10 " + (b>>>10) + " ; result -->" + Integer.toBinaryString(b>>>10));
}
}
