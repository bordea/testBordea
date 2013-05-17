package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Cadbury extends Chocolate{
    String countryOfProvenience;

    public Cadbury() {
    }

    public Cadbury(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, String countryOfProvenience) {
        super(chocolateName);
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(int[][] grams, String countryOfProvenience) {
        super(grams);
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int[][] grams, String countryOfProvenience) {
        super(chocolateName, grams);
        this.countryOfProvenience = countryOfProvenience;
    }

    public void isCheap() {
    }

    public void enGross() {
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
                ", grams=" + Arrays.toString(grams) +
                "countryOfProvenience='" + countryOfProvenience + '\'' +
                '}';
    }
}
