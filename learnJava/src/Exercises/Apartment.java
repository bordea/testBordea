package Exercises;

public abstract class Apartment {

    protected int temperature;

    int numberOfRadiators;

    protected Apartment() {
    }

    protected Apartment(int temperature) {
        this.temperature = temperature;
    }

    protected Apartment(int temperature, int numberOfRadiators) {
        this.temperature = temperature;
        this.numberOfRadiators = numberOfRadiators;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setNumberOfRadiators(int numberOfRadiators) {
        this.numberOfRadiators = numberOfRadiators;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getNumberOfRadiators() {
        return numberOfRadiators;
    }

    public void needsHeat(){
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "temperature=" + temperature +
                ", numberOfRadiators=" + numberOfRadiators +
                '}';
    }
}
