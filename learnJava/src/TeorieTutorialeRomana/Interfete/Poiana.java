package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Poiana extends Chocolate{
    String name;
    int price;

    public Poiana() {
    }

    public Poiana(String name) {
        this.name = name;
    }

    public Poiana(String chocolateName, int weight, String name) {
        super(chocolateName, weight);
        this.name = name;
    }

    public Poiana(String chocolateName, int weight, int gramsOfSugar, String name, String productionDate, int price) {
        super(chocolateName, weight, gramsOfSugar, productionDate);
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Poiana{" +
                "chocolateName='" + chocolateName + '\'' +
                ", weight=" + weight +
                ", gramsOfSugar=" + gramsOfSugar +
                ", productionDater=" + productionDate +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void isCheap() {
        if (this.price >40){
            System.out.println(" This a rather expensive piece of Poiana ");
        }
        else{
            System.out.println(" This Poiana can be enjoyed without burning your pocket ");
        }
    }

    public void enGross() {
        System.out.println("This product can only be bought EN-GROSS");
    }

    public void isRecyclable() {

    }
}
