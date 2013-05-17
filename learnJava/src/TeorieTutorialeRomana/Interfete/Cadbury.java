package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Cadbury extends Chocolate{
    String countryOfProvenience;

    public Cadbury() {
    }

    public Cadbury(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, String countryOfProvenience) {
        super(chocolateName, weight);
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, int gramsOfSugar, String countryOfProvenience) {
        super(chocolateName, weight, gramsOfSugar);
        this.countryOfProvenience = countryOfProvenience;
    }

    public String getCountryOfProvenience() {
        return countryOfProvenience;
    }

    public void setCountryOfProvenience(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateName='" + chocolateName + '\'' +
                ", weight=" + weight +
                ", gramsOfSugar=" + gramsOfSugar +
                "countryOfProvenience='" + countryOfProvenience + '\'' +
                '}';
    }

    @Override
    public void isCheap() {
    }

    @Override
    public void enGross() {
    }
}
