package abstractPack;

public abstract class Car extends Autovehicle{

    int numberofdoors;

    protected Car() {}

    public int getNumberofdoors() {
        return numberofdoors;
    }

    public void setNumberofdoors(int numberofdoors) {
        this.numberofdoors = numberofdoors;
    }
}
