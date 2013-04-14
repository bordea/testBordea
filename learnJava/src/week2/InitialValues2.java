package week2;

public class InitialValues2 {
    boolean bool = true;
    char ch = 'x';
    byte b = 47;
    short s = 0xff;
    int i = 999;
    long lng = 1;
    float f = 3.14f;
    double d = 3.14159;

    int k = f();
    int j = g(k);
    int f() { return 11; }
    int g(int n) { return n * 10; }

    public static void main(String[] args) {
        InitialValues2 iv = new InitialValues2();

    }
}
