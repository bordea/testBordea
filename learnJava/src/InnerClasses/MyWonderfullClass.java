package InnerClasses;

class MyWonderfulClass {
    void go() {
        Ba b = new Ba();
        b.doStuff(new Fo() {

            public void foof() {
                System.out.println("foofy");
                }                                   // end foof method

            });                                     // end inner class def, arg, and b.doStuff stmt.
        }                                           // end go()
}
