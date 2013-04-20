package abstractPack;

public class VW extends Car{

    int rezistenta;

    public VW() {}

    @Override
    public void makeNoise() {
        System.out.println("vw noise");
    }

    public int getRezistenta() {
        return rezistenta;
    }

    public void setRezistenta(int rezistenta) {
        this.rezistenta = rezistenta;
    }
}
