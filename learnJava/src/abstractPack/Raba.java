package abstractPack;

public class Raba extends CommercialVehicle {

    int carryWeight;

    protected Raba() {
    }

    @Override
    public void makeNoise() {
        System.out.println("raba noise");
    }

    public int getCarryWeight() {
        return carryWeight;
    }

    public void setCarryWeight(int carryWeight) {
        this.carryWeight = carryWeight;
    }
}
