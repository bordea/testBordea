package Haine;

public class SportTrousers extends Bottoms {
    String length;

    public SportTrousers(int size, String color, char gen, String material, String length) {
        super(size, color, gen, material);
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Clothes{ " +
                "size= " + size +
                ", color='" + color + '\'' +
                ", gen= " + gen +
                ", material= " + material +
                ", length= " + length +
                '}';
    }
}
