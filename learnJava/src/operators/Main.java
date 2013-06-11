package operators;

class Tank {
    int level;
}

class Letter {
    char c;
    String s;
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
        print("PREincrement --> ++i --> " + ++i); // Pre-increment
        print("POSTincrement --> i++ --> " + i++); // Post-increment
        print("i --> " + i);
        print("PREdecrement --> --i : " + --i); // Pre-decrement
        print("POSTdecrement --> i-- : " + i--); // Post-decrement
        print("i --> " + i);
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
