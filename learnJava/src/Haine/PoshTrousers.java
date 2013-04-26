package Haine;

public class PoshTrousers extends Bottoms{
    String ocassion;

    public PoshTrousers(int size, String color, char gen, String material, String ocassion) {
        super(size, color, gen, material);
        this.ocassion = ocassion;
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
                ", material= " + material +
                ", ocassion= " + ocassion +
                '}';
    }
}
