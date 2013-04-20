package abstractPack;

public class Bycicle extends Autovehicle {

    int spite;

    public Bycicle() {
    }

    public int getSpite() {
        return spite;
    }

    public void setSpite(int spite) {
        this.spite = spite;
    }

    @Override
    public void makeNoise() {
        System.out.println("bycicle noise");
    }
}
