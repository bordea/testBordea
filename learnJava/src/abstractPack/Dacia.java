package abstractPack;

public class Dacia extends Car{
    boolean madeInRo;

    public Dacia() {}

    @Override
    public void makeNoise() {
        System.out.println("Dacia Noise " + " ||  Masina este romaneasca? " + madeInRo);
    }

    public boolean isMadeInRo() {
        return madeInRo;
    }

    public void setMadeInRo(boolean madeInRo) {
        this.madeInRo = madeInRo;
    }
}
