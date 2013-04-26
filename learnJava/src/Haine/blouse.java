package Haine;

public class blouse extends Tops{
    String material;

    public blouse(int size, String color, char gen, String sleeveSize, boolean vNeck, String material) {
        super(size, color, gen, sleeveSize, vNeck);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Clothes{ " +
                "size= " + size +
                ", color='" + color + '\'' +
                ", gen= " + gen +
                ", sleeve size= " + sleeveSize +
                ", vneck= " + vNeck +
                ", material= " + material +
                '}';
    }
}
