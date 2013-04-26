package Haine;

public abstract class Bottoms extends Clothes{
    String material;

    public Bottoms(int size, String color, char gen, String material) {
        super(size, color, gen);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
