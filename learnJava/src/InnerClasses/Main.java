package InnerClasses;

public class Main {
    public static void main(String[] args){
      //  InnerClass1 ic1= new InnerClass1();
        InnerClass1.TheInnerClass ictic = new InnerClass1().new TheInnerClass();
        ictic.valoare();
    }
}
