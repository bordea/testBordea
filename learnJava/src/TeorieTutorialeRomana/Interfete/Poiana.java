package TeorieTutorialeRomana.Interfete;

import java.util.*;

public class Poiana extends Chocolate{
    String name;

    public void isCheap() {
    }

    public void enGross() {
    }

    public Poiana() {
    }

    public Poiana(String name) {
        this.name = name;
    }

    public Poiana(String chocolateName, String name) {
        super(chocolateName);
        this.name = name;
    }

    public Poiana(int[][] grams, String name) {
        super(grams);
        this.name = name;
    }

    public Poiana(String chocolateName, int[][] grams, String name) {
        super(chocolateName, grams);
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
        return "Chocolate{" +
                "chocolateName='" + chocolateName + '\'' +
                ", grams=" + Arrays.toString(grams) +
                "name='" + name + '\'' +
                '}';
    }

}
