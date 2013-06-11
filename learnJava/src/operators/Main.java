package operators;

class Tank {
    int level;
}

class Letter {
    char c;
    String s;
}

class Value {
    int i;
}

public class Main {
    public static void main (String args[]){
        System.out.println("Printing through syntax");
        print("Printing through method call");

        int a,b,c;
        a = 5;
        b = a;
        c = a/b*a*b;
        print(a);
        print(b);
        print(c);

        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 11;
        t2.level = 47;
        print("t1.level--> " + t1.level + "|| t2.level--> " + t2.level);   // so far everything is straightforward
        t1 = t2;         // t1 and t2 will have the same reference  ALSO the original reference that t1 had will be forever lost
        print("t1.level--> " + t1.level + "|| t2.level--> " + t2.level);
        t1.level = 33;                                          // because t1 and t2 have the same reference the change of one of them
        print("t1.level--> " + t1.level + "|| t2.level--> " + t2.level);   // will automatically change the other one too
        Tank t3 = new Tank();
        Tank t4 = new Tank();
        t3.level = 23;
        t4.level = 78;
        print("t3.level--> " + t3.level + "|| t4.level--> " + t4.level);
        t3.level = t4.level;                // we're copying the value of level in t4 to level in t3
        print("t3.level--> " + t3.level + "|| t4.level--> " + t4.level);
        t3.level = 99;                      // becuse we don't have the same reference for t3 and t4 when one of them changes
        print("t3.level--> " + t3.level + "|| t4.level--> " + t4.level);  // the other one remains the same
        t4.level = 77;                      // becuse we don't have the same reference for t3 and t4 when one of them changes
        print("t3.level--> " + t3.level + "|| t4.level--> " + t4.level);  // the other one remains the same

        Letter x = new Letter();
        x.c = 'a';
        print("x.c--> " + x.c);
        f(x);
        print("x.c--> " + x.c);

        int i = 1;
        print("i --> " + i);
        print("PREincrement --> ++i --> " + ++i); // Pre-increment     --> the incrementation is done before the printing
        print("POSTincrement --> i++ --> " + i++); // Post-increment   --> the incrementation is done after the printing
        print("i --> " + i);
        print("PREdecrement --> --i : " + --i); // Pre-decrement  --> the decrementation is done before the printing
        print("POSTdecrement --> i-- : " + i--); // Post-decrement   --> the decrementation is being done after the printing
        print("i --> " + i);

        Integer n1 = new Integer(47);  // n1 and n2 have the same value(content) but this doesn't mean that they have the same reference
        Integer n2 = new Integer(47);  // n1 will have its own reference and n2 will have its own refeence
        System.out.println("n1 == n2 -->  " + (n1 == n2));  // this will return false because the n1's reference is different to n2's reference
        System.out.println("n1 != n2 -->  " + (n1 != n2));  // this will return true because n1 and n2 have two different references
        System.out.println("n1.equals(n2) -->  " + n1.equals(n2)); // we are using the equals method to compare the contents of the two
                                                        // objects so it returns true
        Value v1 = new Value();
        Value v2 = new Value();       // v1 and v2 have different references
        v1.i = v2.i = 100;            // v1 and v2 still have different references because we've only given value to v1.i and v2.i
        System.out.println("v1.equals(v2) -->  " + v1.equals(v2));  // false because they have a reference each
        v1=v2;
        System.out.println("v1.equals(v2) -->  " + v1.equals(v2));  // true because now they have the same reference

        ShortCircuit sc = new ShortCircuit();
        boolean bool = sc.test1(0) && sc.test2(2) && sc.test3(2);
        print("expression is " + bool);
    }

    static void f(Letter y) {
        y.c = 'z';                      // the outside object is being changed with this assignment
    }

 /*   static String ff(Letter y){
        y.s = y.c + y.c;
        return y.s;
    } */

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(int i){
        System.out.println(i);
    }
}
