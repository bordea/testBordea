package collections.map;

public class Monitor extends Computer{
    int diag;
    double weight;

    public Monitor(int id, String name, int diag, double weight) {
        super(id,name);
        this.diag = diag;
        this.weight = weight;
    }

    public static void isFlat(Monitor m){
        if (m.weight < 1.7 ){
            System.out.println("FLAT SCREEN TOATA ZIUA !!!");
        }
    }

    public int getDiag() {
        return diag;
    }

    public void setDiag(int diag) {
        this.diag = diag;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diagonala=" + diag +
                ", weight=" + weight +
                '}';
    }
}
