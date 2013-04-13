package bigining;

public class StringOperators {
    public static void main(String[] args) {
        int x = 22, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);                    // Converts x to a String

        s += "(summed) = ";                                 // Concatenation operator
        System.out.println("s --> " + s);
        System.out.println(s + (x + y + z));
        System.out.println("" + x);                         // Shorthand for Integer.toString()
    }
}
