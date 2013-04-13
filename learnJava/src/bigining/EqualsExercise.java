package bigining;

/* Exercise 14: (3) Write a method that takes two String arguments and uses all the boolean comparisons to compare the
 two Strings and print the results. For the == and !=, also perform the equals( ) test. In main( ), call your method with
 some different String objects. */

public class EqualsExercise {
    static boolean CompareStrings(String val1,String val2) {
        System.out.println(val1 == val2);
        return val1.equals(val2);
    }

    public static void main(String[] args) {
        String s1 = "abc", s2 = "abd";
        System.out.print("s1 = s2 ");
        CompareStrings(s1, s2);
        String s3 = "aaa", s4 = "aaaa";
        System.out.print("s3 = s4 ");
        CompareStrings(s3, s4);
        String s5 = "abc", s6 = "abc";
        System.out.print("s5 = s6 ");
        CompareStrings(s5, s6);
    }
}
