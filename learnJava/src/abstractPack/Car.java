package abstractPack;

public abstract class Car extends Autovehicle{

    int numberofdoors;

    int km;

    protected Car() {}

    public int getNumberofdoors() {
        return numberofdoors;
    }

    public void setNumberofdoors(int numberofdoors) {
        this.numberofdoors = numberofdoors;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
