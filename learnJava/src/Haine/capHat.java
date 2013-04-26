package Haine;

public class capHat extends Hats {
    String ocassion;

    public capHat(int size, String color, char gen, boolean washable, String ocassion) {
        this.size = size;
        this.color = color;
        this.gen = gen;
        this.washable = washable;
        this. ocassion = ocassion;
    }

    public String getOcassion() {
        return ocassion;
    }

    public void setOcassion(String ocassion) {
        this.ocassion = ocassion;
    }
}
