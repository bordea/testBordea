package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Cadbury extends Chocolate{
    String countryOfProvenience;
    String productionDate;

    public Cadbury() {
    }

    public Cadbury(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, String countryOfProvenience) {
        super(chocolateName, weight);
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, int gramsOfSugar, String countryOfProvenience, String productionDate) {
        super(chocolateName, weight, gramsOfSugar);
        this.countryOfProvenience = countryOfProvenience;
        this.productionDate = productionDate;
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
                " countryOfProvenience='" + countryOfProvenience + '\'' +
                " productionDate='" + productionDate + '\'' +
                '}';
    }

    public void isCheap() {

    }

    public void enGross() {

    }

    public void isExpired() {

    }

    public void isRecyclable() {

    }
}
