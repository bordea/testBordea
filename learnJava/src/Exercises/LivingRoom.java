package Exercises;

import java.util.*;

public class LivingRoom extends Apartment{

    protected Map<Enum, Integer> dimensions = new HashMap<Enum, Integer>();   // daca facem Map final nu putem construi constructorul

    protected String floorType;

    public LivingRoom(String floorType) {
        this.floorType = floorType;
    }

    public LivingRoom(int temperature, String floorType) {
        super(temperature);
        this.floorType = floorType;
    }

    public LivingRoom(int temperature, int numberOfRadiators, String floorType) {
        super(temperature, numberOfRadiators);
        this.floorType = floorType;
    }

    public LivingRoom(Map<Enum, Integer> dimensions){
        this.dimensions = dimensions;
    }

    public LivingRoom(int temperature, int numberOfRadiators, Map<Enum, Integer> dimensions, String floorType) {
        super(temperature, numberOfRadiators);
        this.dimensions = dimensions;
        this.floorType = floorType;
    }

    public LivingRoom(int temperature, int numberOfRadiators, Map<Enum, Integer> dimensions) {
        super(temperature, numberOfRadiators);
        this.dimensions = dimensions;
    }


    public LivingRoom(Map<Enum, Integer> dimensions, String floorType) {
        this.dimensions = dimensions;
        this.floorType = floorType;
    }

    public Map<Enum, Integer> getDimensions() {
        return dimensions;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setDimensions(Map<Enum, Integer> dimensions) {
        this.dimensions = dimensions;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "temperature=" + temperature +
                ", numberOfRadiators=" + numberOfRadiators +
                ", dimensions=" + dimensions +
                ", floorType=" + floorType +
                '}';
    }
}
