package InnerClasses;

class MyOuter2 {                                        // definirea clasei outer
    private String x = "MyOuter2";

    void doStuff() {                                    // definirea metodei doStuff()

        class MyInner {                                 // definirea clasei inner

            public void vedemOuteru() {                    // metoda clasei inner

                System.out.println("Suntem in interiorul metodei clasei inner ");

                System.out.println("Clasa de dinafara este " + x);

            }                                           // inchidem metoda clasei inner

        }                                               // inchidem definirea inner class

        MyInner mi = new MyInner();                     // instantierea se va face DOAR DUPA definirea clasei
        mi.vedemOuteru();

    }                                                   // inchidem metoda clasei outer

}                                                       // inchidem clasa outer
