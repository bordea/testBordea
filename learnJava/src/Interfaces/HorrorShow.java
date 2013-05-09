package Interfaces;

interface Monster {
    void menace();
}
interface DangerousMonster extends Monster {
    void destroy();
}
interface Lethal {
    void kill();
}
class DragonZilla implements DangerousMonster {
    public void menace() {System.out.println("Dragon Causing Menace");}
    public void destroy() {System.out.println("Dragon Causing Destruction");}
}
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
class VeryBadVampire implements Vampire {
    public void menace() {System.out.println("Vampire Causing Menace");}
    public void destroy() {System.out.println("Vampire Causing Destruction");}
    public void kill() {System.out.println("Vampire Causing Killings");}
    public void drinkBlood() {System.out.println("Vampire Causing Bllod Loss");}
}
public class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
