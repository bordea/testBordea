package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Cadbury extends Chocolate{
    String countryOfProvenience;
    int price;
    String ambalaj;

    public Cadbury() {
    }

    public Cadbury(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, String countryOfProvenience) {
        super(chocolateName, weight);
        this.countryOfProvenience = countryOfProvenience;
    }

    public Cadbury(String chocolateName, int weight, int gramsOfSugar, String countryOfProvenience, String ambalaj,
                   String productionDate, int price){
        super(chocolateName, weight, gramsOfSugar,productionDate,ambalaj);
        this.countryOfProvenience = countryOfProvenience;
        this.price = price;
        this.ambalaj = ambalaj;
    }

    public String getCountryOfProvenience() {
        return countryOfProvenience;
    }

    public void setCountryOfProvenience(String countryOfProvenience) {
        this.countryOfProvenience = countryOfProvenience;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAmbalaj() {
        return ambalaj;
    }

    public void setAmbalaj(String ambalaj) {
        this.ambalaj = ambalaj;
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
        if (countryOfProvenience == "Ireland"){
            System.out.println("This Cadbury can also be bought EN-Detail");
        }
        else{
            System.out.println("This Cadbury can only be bought EN-GROSS");
        }
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
