package Exercises;

import java.util.*;

public class Bathroom extends Apartment{

    String floorType;

    protected int numberOfLights;

    Map<String, Integer> bathSize= new HashMap<String, Integer>();

    public Bathroom(int temperature, int numberOfRadiators, String floorType, int numberOfLights) {
        super(temperature,numberOfRadiators);
        this.floorType = floorType;
        this.numberOfLights = numberOfLights;
    }

    protected void hasVentilation(){
    }

    public Bathroom() {
    }

    public Bathroom(String floorType, int numberOfLights, Map<String, Integer> bathSize) {
        this.floorType = floorType;
        this.numberOfLights = numberOfLights;
        this.bathSize = bathSize;
    }

    public Bathroom(int temperature, String floorType, int numberOfLights, Map<String, Integer> bathSize) {
        super(temperature);
        this.floorType = floorType;
        this.numberOfLights = numberOfLights;
        this.bathSize = bathSize;
    }

    public Bathroom(int temperature, int numberOfRadiators, String floorType, int numberOfLights, Map<String, Integer> bathSize) {
        super(temperature, numberOfRadiators);
        this.floorType = floorType;
        this.numberOfLights = numberOfLights;
        this.bathSize = bathSize;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public Map<String, Integer> getBathSize() {
        return bathSize;
    }

    public void setBathSize(Map<String, Integer> bathSize) {
        this.bathSize = bathSize;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "temperature=" + temperature +
                ", numberOfRadiators=" + numberOfRadiators +
                ", floorType=" + floorType +
                ", numberOfLights=" + numberOfLights +
                ", bathSize=" + bathSize +
                '}';
    }
}
