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

public class Biology {
    static class amiba implements MicroOrg{
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
    public static void main(String[] args){
        amiba a = new amiba();

    }
}
