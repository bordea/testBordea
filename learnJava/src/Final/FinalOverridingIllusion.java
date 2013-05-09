package Final;

class WithFinals {

    private final void f() { System.out.println("WithFinals.f()"); }    // este la fel ca si cum am lasa FINAL afara

    private void g() { System.out.println("WithFinals.g()"); }          // FINAL se subintelege
}
class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;         // putem sa facem upcast
// Nu putem sa chemam, sa accesam metodele
//! op.f();
//! op.g();
        WithFinals wf = op2;
// Nu putem sa chemam, sa accesam metodele
//! wf.f();
//! wf.g();
    }
}
