package InnerClasses;

public class OutsideMyOuter {

    MyOuter Example1 = new MyOuter();

    MyOuter.Inner2 Inner2Outside = new MyOuter().new Inner2();

    MyOuter Ex = new MyOuter();
    MyOuter.Inner2 Inner2Out = Ex.new Inner2();

}
