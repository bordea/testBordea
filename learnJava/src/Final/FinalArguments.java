package Final;

class Gizmo {
    public void spin() {}
}
public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmo(); --> nu e permis pentru ca g e FINAL
    }
    void without(Gizmo g) {
        g = new Gizmo();                // este permis pentru ca g nu este FINAL
        g.spin();
    }

    // void f(final int i) { i++; } --> nu se poate schimba si de la o final primitive se poate doar citi
    int g(final int i) { return i + 1; }    // putem sa citim argumentul dar nu-l putem schimba

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}