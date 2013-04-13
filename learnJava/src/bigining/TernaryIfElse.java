package bigining;

public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;        // IF i < 10 RETURN i * 100 ELSE RETURN i * 10
    }                                            // generally used when setting a variable to one of two values.
    static int standardIfElse(int i) {
        if(i < 10)
            return i * 100;
        else
            return i * 10;
    }
    public static void main(String[] args) {
        System.out.println(ternary(9));

        System.out.println(ternary(10));

        System.out.println(standardIfElse(9));

        System.out.println(standardIfElse(10));
}
}
