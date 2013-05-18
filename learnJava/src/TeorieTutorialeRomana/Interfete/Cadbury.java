package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Cadbury extends Chocolate{
    String countryOfProvenience;
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
                " countryOfProvenience='" + countryOfProvenience + '\'' +
                " price='" + price + '\'' +
                '}';
    }

    public void enGross() {

    }

    public void isRecyclable() {

    }

    public void isCheap() {
        if (this.price >40){
            System.out.println(" This a rather expensive piece of Poiana ");
        }
        else{
            System.out.println(" This Poiana can be enjoyed without burning your pocket ");
        }
    }
}
