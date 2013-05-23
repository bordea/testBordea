package Generice;

public class GenericMethod {

    public static <U> void testMethod(U u) {
        System.out.println(u);
    }

    public static void main(String[] args) {
        GenericMethod.testMethod("test");             // puem scrie  GenericMethod.<String>testMethod("test"); dar nu este necesar
        GenericMethod.testMethod(10);
    }
}
