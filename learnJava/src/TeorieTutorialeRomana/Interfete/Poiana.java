package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Poiana extends Chocolate{
    String name;

    public Poiana() {
    }

    public Poiana(String name) {
        this.name = name;
    }

    public Poiana(String chocolateName, int weight, String name) {
        super(chocolateName, weight);
        this.name = name;
    }

    public Poiana(String chocolateName, int weight, int gramsOfSugar, String name) {
        super(chocolateName, weight, gramsOfSugar);
        this.name = name;
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
                "name='" + name + '\'' +
                '}';
    }

    public void isCheap() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void enGross() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
