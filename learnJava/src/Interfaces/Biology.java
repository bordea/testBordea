package Interfaces;

interface HasBody{
    void body();
}
interface HasBranch extends HasBody{
    void branch();
}
interface HasLeaves extends HasBody{
    void leaves();
}
interface MicroOrg extends HasBranch, HasLeaves{
    void isAlive();
}
class amiba implements MicroOrg{
    public void isAlive() {
        System.out.println("isAlive");
    }
    public void branch() {
        System.out.println("branch");
    }
    public void leaves() {
        System.out.println("leaves");
    }
    public void body() {
        System.out.println("body");
    }
}
public class Biology {
    public static void main(String[] args){
        amiba a = new amiba();
        a.body();
        celula1(a);
        a.branch();
        celula2(a);
        a.leaves();
        celula3(a);
        a.isAlive();
        celula4(a);
    }

    public static void celula1(MicroOrg x){x.body();};

    public static void celula2(MicroOrg x){x.branch();};

    public static void celula3(MicroOrg x){x.leaves();};

    public static void celula4(MicroOrg x){x.isAlive();};
}
