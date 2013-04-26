package Haine;

public abstract class Tops extends Clothes{
    String  sleeveSize;

    boolean vNeck;

    public Tops(int size, String color, char gen,String sleeveSize) {
        super(size, color, gen);
        this.sleeveSize = sleeveSize;
    }


    public String getSleeveSize() {
        return sleeveSize;
    }

    public void setSleeveSize(String sleeveSize) {
        this.sleeveSize = sleeveSize;
    }

    public boolean isvNeck() {
        return vNeck;
    }

    public void setvNeck(boolean vNeck) {
        this.vNeck = vNeck;
    }
}
