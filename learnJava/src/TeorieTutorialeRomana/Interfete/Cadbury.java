package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Cadbury extends Chocolate{
    String countryOfProvenience;
    String productionDate;
    int price;

    public Cadbury() {
    }

    public Cadbury(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, String countryOfProvenience) {
        super(chocolateName, weight);
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, int gramsOfSugar, String countryOfProvenience, String productionDate, int price) {
        super(chocolateName, weight, gramsOfSugar,productionDate);
        this.countryOfProvenience = countryOfProvenience;
        this.productionDate = productionDate;
        this.price = price;
    }

    public String getCountryOfProvenience() {
        return countryOfProvenience;
    }

    public void setCountryOfProvenience(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateName='" + chocolateName + '\'' +
                ", weight=" + weight +
                ", gramsOfSugar=" + gramsOfSugar +
                " productionDate='" + productionDate + '\'' +
                " price='" + price + '\'' +
                '}';
    }

    public void isCheap() {

    }

    public void enGross() {

    }

    public void isExpired() {

    }

    public void isFresh() {

    }

    public void isRecyclable() {

    }
}
