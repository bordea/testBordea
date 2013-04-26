package Haine;

public class capHat extends Hats {
    String ocassion;

    public capHat(int size, String color, char gen, boolean washable) {
        super(size, color, gen, washable);
        this.washable = washable;
    }


    public String getOcassion() {
        return ocassion;
    }

    public void setOcassion(String ocassion) {
        this.ocassion = ocassion;
    }

    @Override
    public String toString() {
        return "Clothes{ " +
                "size= " + size +
                ", color='" + color + '\'' +
                ", gen= " + gen +
                ", washable= " + washable +
                ", ocassion= " + ocassion +
                '}';
    }
}
