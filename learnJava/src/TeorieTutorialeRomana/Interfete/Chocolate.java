package TeorieTutorialeRomana.Interfete;

import java.util.Arrays;

abstract class Chocolate implements Food{
    String chocolateName;
    int[][] grams;


    protected Chocolate() {
    }

    protected Chocolate(String chocolateName) {
        this.chocolateName = chocolateName;
    }

    protected Chocolate(int[][] grams) {
        this.grams = grams;
    }

    protected Chocolate(String chocolateName, int[][] grams) {
        this.chocolateName = chocolateName;
        this.grams = grams;
    }

    String getChocolateName() {
        return chocolateName;
    }

    void setChocolateName(String chocolateName) {
        this.chocolateName = chocolateName;
    }

    int[][] getGrams() {
        return grams;
    }

    void setGrams(int[][] grams) {
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateName='" + chocolateName + '\'' +
                ", grams=" + Arrays.toString(grams) +
                '}';
    }
}
