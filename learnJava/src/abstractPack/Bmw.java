package abstractPack;

public class Bmw extends Car{

    boolean canDrift;

    public Bmw() {}

    @Override
    public void makeNoise() {
        System.out.println("BMW noise drifting noise " + canDrift);
    }

    public boolean isCanDrift() {
        return canDrift;
    }

    public void setCanDrift(boolean canDrift) {
        this.canDrift = canDrift;
    }
}
