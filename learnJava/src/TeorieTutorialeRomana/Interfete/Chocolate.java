package TeorieTutorialeRomana.Interfete;

import java.util.Arrays;

abstract class Chocolate implements Food{
    String chocolateName;
    int weight;
    int gramsOfSugar;
    String productionDate;

    protected Chocolate() {
    }

    protected Chocolate(String chocolateName, int weight) {
        this.chocolateName = chocolateName;
        this.weight = weight;
    }

    protected Chocolate(String chocolateName, int weight, int gramsOfSugar, String productionDate) {
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

    String getProductionDate() {
        return productionDate;
    }

    void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    void setGramsOfSugar(int gramsOfSugar) {
        this.gramsOfSugar = gramsOfSugar;
    }

    public Integer daysTillExpires(){
        int zile = 0;
        System.out.println(this.productionDate);
        if (this.getProductionDate() == "Monday"){
            zile = 6;
        }
        else if (this.getProductionDate() == "Tuesday"){
            zile = 5;
        }
        else if (this.getProductionDate() == "Wednesday"){
            zile = 4;
        }
        else if (this.getProductionDate() == "Thursday"){
            zile = 3;
        }
        else if (this.getProductionDate() == "Friday"){
            zile = 2;
        }
        else if (this.getProductionDate() == "Saturday"){
            zile = 1;
        }
        return zile;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateName='" + chocolateName + '\'' +
                ", weight=" + weight +
                ", gramsOfSugar=" + gramsOfSugar +
                ", productionDate=" + productionDate +
                '}';
    }
}
