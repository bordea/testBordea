package TeorieTutorialeRomana.Interfete;

import java.util.Arrays;

abstract class Chocolate implements Food{
    String chocolateName;
    int weight;
    int gramsOfSugar;
    String productionDate;
    String ambalaj;
    int length;

    protected Chocolate() {
    }

    protected Chocolate(String chocolateName, int weight) {
        this.chocolateName = chocolateName;
        this.weight = weight;
    }

    protected Chocolate(String chocolateName, int weight, int gramsOfSugar, String productionDate, String ambalaj, int length) {
        this.chocolateName = chocolateName;
        this.weight = weight;
        this.gramsOfSugar = gramsOfSugar;
        this.productionDate = productionDate;
        this.ambalaj = ambalaj;
        this.length = length;
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

    String getAmbalaj() {
        return ambalaj;
    }

    void setAmbalaj(String ambalaj) {
        this.ambalaj = ambalaj;
    }

    int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
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

    public void isFresh(){
        if (daysTillExpires() <2){
            System.out.println("This Chocolate is fresh because its made in the last 2 days !!!");
        }
    }

    public void isExpired() {
        if (daysTillExpires()>4){
            System.out.println("This Cholocalate has been on the shelf for over 4 days therefore it's expired !!! ");
        }
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

    public void isRecyclable() {
        if (ambalaj == "carton"){
            System.out.println("Cartonul este reciclabil deci Ciucalata este invelita in material reciclabil !!! ");
        }
    }

    public void isRefundable() {
        if (productionDate =="Sunday" || productionDate =="Saturday" || productionDate == "Friday"){

        }
        else{
            System.out.println("This Chocolate ain;t refundable");
        }
    }

    public void fitInPocket(){
        if (length <16){
            System.out.println(" This chocolate fits in the pocket ");
        }
    }
}
