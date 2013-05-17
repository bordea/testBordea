package TeorieTutorialeRomana.Interfete;

import java.util.Arrays;

abstract class Chocolate implements Food{
    String chocolateName;
    int weight;
    int gramsOfSugar;

    protected Chocolate() {
    }

    protected Chocolate(String chocolateName, int weight) {
        this.chocolateName = chocolateName;
        this.weight = weight;
    }

    protected Chocolate(String chocolateName, int weight, int gramsOfSugar) {
        this.chocolateName = chocolateName;
        this.weight = weight;
        this.gramsOfSugar = gramsOfSugar;
    }

    void isCausingDiabetees(Chocolate c){
        if (  (100*(c.getGramsOfSugar()) / c.weight  ) > 15){
            System.out.println("This is a dangerous chocolate and there's a risk of diabetees!");
        }
        else{
            System.out.println("This is a diabetees safe chocolate!");
        }
    }

    Integer sugarGrams(Chocolate c){
        int sg = 0 ;
        if (  (100*(c.getGramsOfSugar()) / c.weight  ) > 15){
            sg = (100*(c.getGramsOfSugar()) / c.weight );
        }
        return sg;
    }

    String getChocolateName() {
        return chocolateName;
    }

    void setChocolateName(String chocolateName) {
        this.chocolateName = chocolateName;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getGramsOfSugar() {
        return gramsOfSugar;
    }

    void setGramsOfSugar(int gramsOfSugar) {
        this.gramsOfSugar = gramsOfSugar;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateName='" + chocolateName + '\'' +
                ", weight=" + weight +
                ", gramsOfSugar=" + gramsOfSugar +
                '}';
    }
}
