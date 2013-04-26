package Haine;

public class tShirt extends Tops {
    String logo;

    public tShirt(int size, String color, char gen, String sleeveSize, boolean vNeck, String logo) {
        super(size, color, gen, sleeveSize, vNeck );
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Clothes{ " +
                "size= " + size +
                ", color='" + color + '\'' +
                ", gen= " + gen +
                ", = " + sleeveSize +
                ", logo= " + logo +
                '}';
    }
}
