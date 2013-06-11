package operators;

public class ShortCircuit {
    static boolean t1 (int v){
        print("v = " + v + " < 9  ???  -->   " + (v<9));
        return (v<3);
    }
    static boolean t2 (int v){
        print("v = " + v + " < 6  ???  -->   " + (v<6));
        return (v<3);
    }
    static boolean t3 (int v){
        print("v = " + v + " < 3  ???  -->   " + (v<3));
        return (v<3);
    }
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("result: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("result: " + (val < 3));
        return val < 3;
    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(int i){
        System.out.println(i);
    }
}
