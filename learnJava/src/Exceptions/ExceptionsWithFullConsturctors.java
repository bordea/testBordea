package Exceptions;

class MyException extends Exception {
    public MyException() {}                             // doi constructori care definesc cum MyException e creata
    public MyException(String msg) { super(msg); }      // se invoca super constructorul din clasa de baza
}
public class ExceptionsWithFullConsturctors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(MyException e) {
            e.printStackTrace(System.out);              //produce informatia despre secven ta de metode care au fost actionate
        }                                               //pana s-a ajuns la exceptie
        try {
            g();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
