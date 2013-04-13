package bigining;

public class Equivalance {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);       // two different object being referred to therefore false
        System.out.println(n1 != n2);
    }
}
