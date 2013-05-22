package InnerClasses;

public class InnerClass1 {

    private int x = 123;

    class TheInnerClass {

        private int y;

        public void valoare() {
            afisare();
            System.out.println(" Valoarea clasei outer --> " + x);

        }
    }

    public void afisare(){
        System.out.println("Afisarea clasei outer");
    }

    public void accesareaTheInnerClass(){
        TheInnerClass tic = new TheInnerClass();
        tic.y = 456;
        System.out.println("Valoarea clasei inner --> " + tic.y);
    }

}
