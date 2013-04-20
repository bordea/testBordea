package abstractPack;

public abstract class Motocycle extends Autovehicle{

    int nrofpassangers;

    protected Motocycle() {}

    public int getNrofpassangers() {
        return nrofpassangers;
    }

    public void setNrofpassangers(int nrofpassangers) {
        this.nrofpassangers = nrofpassangers;
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "nrofpassangers=" + nrofpassangers +
                '}';
    }
}
