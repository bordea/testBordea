package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Poiana extends Chocolate{
    String name;
    String productionDate;

    public Poiana() {
    }

    public Poiana(String name) {
        this.name = name;
    }

    public Poiana(String chocolateName, int weight, String name) {
        super(chocolateName, weight);
        this.name = name;
    }

    public Poiana(String chocolateName, int weight, int gramsOfSugar, String name, String productionDate) {
        super(chocolateName, weight, gramsOfSugar);
        this.name = name;
        this.productionDate = productionDate;
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
                ", name='" + name + '\'' +
                ", productionDate='" + productionDate + '\'' +
                '}';
    }

    public void isCheap() {

    }

    public void enGross() {
        System.out.println("This product can only be bought EN-GROSS");
    }

    @Override
    public void isExpired() {

    }
}
