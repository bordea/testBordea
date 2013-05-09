package Interfaces;

class A {
    interface B {                                                   // interfata 'nested' intr-o clasa
        void f();
    }
    public class BImp implements B {                                // interfata 'nested' intr-o interfata dintr-o clasa
        public void f() {}
    }
    private class BImp2 implements B {                              // interfata 'nested' intr-o interfata dintr-o clasa
        public void f() {}
    }
    public interface C {                                            // interfata 'nested' intr-o clasa
        void f();
    }
    class CImp implements C {                                       // interfata 'nested' intr-o interfata dintr-o clasa
        public void f() {}
    }
    private class CImp2 implements C {                              // interfata 'nested' intr-o interfata dintr-o clasa
        public void f() {}
    }
    private interface D {                                           // interfata 'nested' intr-o clasa
        void f();
    }
    private class DImp implements D {                               // interfata 'nested' intr-o interfata dintr-o clasa
        public void f() {}
    }
    public class DImp2 implements D {                               // interfata 'nested' intr-o interfata dintr-o clasa
        public void f() {}
    }
    public D getD() { return new DImp2(); }                         // interfata publica
    private D dRef;                                                 // interfata privata
    public void receiveD(D d) {                                     // metoda publica
        dRef = d;
        dRef.f();
    }
}
interface E {
    interface G {
        void f();
    }
    public interface H {         // --> "public" redundant          // interfata 'nested' intr-o interfata
        void f();
    }
    void g();
//! private interface I {}       // --> // nu putem avea private intr-o interfata
}
public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {}
    }
    class CImp implements A.C {
        public void f() {}
    }
//! class DImp implements A.D {             // nu putem implementa o interfata privata decat in interiorul claei care defineste interfata
//! public void f() {}
//! }
    class EImp implements E {
        public void g() {}
    }
    class EGImp implements E.G {
        public void f() {}
    }
    class EImp2 implements E {
        public void g() {}
        class EG implements E.G {
            public void f() {}
        }
    }
    public static void main(String[] args) {
        A a = new A();
//! A.D ad = a.getD();                      // nu putem accesa A si D
//! A.DImp2 di2 = a.getD();                 // nu returneaza nimic decat A.D
//! a.getD().f();                           // nu poate accesa un membru al interfetei
        A a2 = new A();                     // numai inca un A poate sa foloseasca getD()
        a2.receiveD(a.getD());
    }
}

