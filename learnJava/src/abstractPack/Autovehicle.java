package abstractPack;

public abstract class Autovehicle {

    protected String carModel;

    protected int speed;

    int numberOfWheels;

    protected int numofGears;

    protected String color;

    protected Autovehicle() {
    }

    public Autovehicle(String carModel, int speed) {
        this.carModel = carModel;
        this.speed = speed;
    }

    public abstract void makeNoise();  // this is how you define a abstract class
    // only methods can be abstract , and if a class has abstract method, then the class is abstract

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumofGears() {
        return numofGears;
    }

    public void setNumofGears(int numofGears) {
        this.numofGears = numofGears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Autovehicle{" +
                "carModel='" + carModel + '\'' +
                ", speed=" + speed +
                ", numberOfWheels=" + numberOfWheels +
                ", numofGears=" + numofGears +
                ", color='" + color + '\'' +
                '}';
    }
}
