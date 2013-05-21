package InnerClasses;

class MyOuter {
    private int x = 7;

    Inner2 i2 = new Inner2();

    public void makeInner() {
        MyInner in = new MyInner();                      // instantiere a clasei inner --> este la fel ca instantierea oricarei alte clase
        in.seeOuter();
    }

    class MyInner {                                     // incepe clasa inner
        public void seeOuter() {
            System.out.println("Am intrat in seeOuter !!!");
            System.out.println("Variabila x este " + x);
            System.out.println("Iesim din seeOuter !!!");
        }
    }                                                 // inchidem clasa inner

    class Inner2{
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


    }
}
