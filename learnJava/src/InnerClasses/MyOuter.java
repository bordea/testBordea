package InnerClasses;

class MyOuter {
    private int x = 7;

    class MyInner {                                     // incepe clasa inner
        public void seeOuter() {
            System.out.println("Outer x is " + x);
        }
    }                                                 // inchidem clasa inner

}
