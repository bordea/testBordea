// Exercise 12: (2) In Adventure.java, add an interface called CanClimb, following the form of the other interfaces.

package Interfaces;

interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
interface CanClimb{
    void climb();
}
class ActionCharacter {
    public void fight() {
        System.out.println("FIGHT");
    }
}
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() { System.out.println("SWIM");}
    public void fly() { System.out.println("FLY");}
    public void climb() { System.out.println("CLIMB");}
}
public class Adventure {
    public static void t(CanFight x) { x.fight(); }

    public static void u(CanSwim x) { x.swim(); }

    public static void v(CanFly x) { x.fly(); }

    public static void w(ActionCharacter x) { x.fight(); }

    public static void z(CanClimb z) { z.climb(); }

    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println("Urmeaza t(h)");
        t(h); // va apela CanFight si printeaza FIGHT
        System.out.println("Urmeaza u(h)");
        u(h); // va apela CanSwim si printeaza SWIM
        System.out.println("Urmeaza v(h)");
        v(h); // va apela CanFly si printeaza FLY
        System.out.println("Urmeaza w(h)");
        w(h); // va apela ActionCharacter si printeaza FIGHT
        System.out.println("Urmeaza z(h)");
        z(h); // va apela ActionCharacter si printeaza FIGHT
    }
}
