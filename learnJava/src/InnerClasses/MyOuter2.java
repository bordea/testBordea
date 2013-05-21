package InnerClasses;

class MyOuter2 {                                        // definirea clasei outer
    private String x = "MyOuter2";

    void doStuff() {                                    // definirea metodei doStuff()

        final String z = "Aceasta este variabila locala";

        class MyInner2 {                                 // definirea clasei inner

            public void vedemOuteru() {                    // metoda clasei inner

                System.out.println("Suntem in interiorul metodei clasei inner ");

                System.out.println("Clasa de dinafara este " + x);

                System.out.println("Avem acces la variabila locala ?  " + z);

            }                                           // inchidem metoda clasei inner

        }                                               // inchidem definirea inner class

        MyInner2 mi = new MyInner2();                     // instantierea se va face DOAR DUPA definirea clasei
        mi.vedemOuteru();

    }                                                   // inchidem metoda clasei outer

    public static void main(String [] args){

        MyOuter2 outer = new MyOuter2();
        outer.doStuff();

    }

}
