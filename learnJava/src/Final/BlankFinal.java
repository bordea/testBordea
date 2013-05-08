package Final;

class Poppet {
    private int i;
    Poppet(int ii) { i = ii; }
}
public class BlankFinal {
    private final int i = 0;                                                  // Initializare final
    private final int j;                                                      // Blank final
    private final Poppet p;                                                   // Blank final referinta
                                                                              // Blank final-urile trebuie intitializate in constructor
    public BlankFinal() {
        j = 1;                                                                // Initializarea blank final-ului
        p = new Poppet(1);                                                    // Initializarea referintei blank final-ului
    }
    public BlankFinal(int x) {
        j = x;                                                                // Initializarea blank final-ului
        p = new Poppet(x);                                                    // Initializarea referintei blank final-ului
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
