package InnerClasses;

class MyOuter {
    private int x = 7;

    Inner2 i2 = new Inner2();

    public void makeInner() {
        MyInner in = new MyInner();                      // instantiere a clasei inner --> este la fel ca instantierea oricarei alte clase
        in.seeOuter();
    }

    protected class MyInner {                                     // incepe clasa inner
        public void seeOuter() {
            System.out.println("Am intrat in seeOuter !!!");
            System.out.println("Variabila x este " + x);
            System.out.println("Iesim din seeOuter !!!");

            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter.this);
        }
    }                                                 // inchidem clasa inner

    private class InnerClass{
        public void vedeOuter() {
            System.out.println("Referinta Inner class --> " + this);

            System.out.println("Referinta Outer class " + MyOuter.this);
        }
    }

    final class InClass{
        public void vedeOuter() {
            System.out.println("Referinta Inner class --> " + this);

            System.out.println("Referinta Outer class " + MyOuter.this);
        }
    }

    public class Inner2{
        public int calculeaza_suma(int i){
            int suma = 0;
            for (int j = 0; j<i; j++){
                suma += i;
            }
            return suma;
        }
    }

    abstract class In2{
        public int calculeaza_suma(int i){
            int suma = 0;
            for (int j = 0; j<i; j++){
                suma += i;
            }
            return suma;
        }
    }


    public static void main(String[] args) {
        MyOuter.MyInner inner = new MyOuter().new MyInner();
        inner.seeOuter();
    //  numele clasei outer . numele clasei inner NUME_VARIABILA = NEW numele clasei outer . NEW numele clasei inner

        MyOuter.Inner2 in = new MyOuter().new Inner2();
        int i = 10;
        System.out.println("Suma primelor " + i + " numere este --> " + in.calculeaza_suma(i));

        MyOuter.InnerClass inn = new MyOuter().new InnerClass();
        inn.vedeOuter();

        MyOuter.InClass innC = new MyOuter().new InClass();
        innC.vedeOuter();

    }
}
