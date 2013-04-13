package bigining;

public class IfElse2 {

    static String test(int testval, int target) {
        if(testval > target)
            return  "Primu mai mare";
        else if(testval < target)
                return  "Al doilea mai mare";
             else
                return  "Sunt egale"; // Match
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test( 5, 5));
    }
}

