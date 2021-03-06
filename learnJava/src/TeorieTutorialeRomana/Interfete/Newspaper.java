package TeorieTutorialeRomana.Interfete;

public class Newspaper implements Document,Packaging,Size,Producer, Promotion {
    String newspaperName;
    int price;
    String day;
    int paperSize;
    String material;
    String language;
    String frequence;
    int boughtForPromotion;

    public Newspaper() {}

    public Newspaper(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public Newspaper(int price) {
        this.price = price;
    }

    public Newspaper(String newspaperName, int price, String day, int paperSize,String material, String language, String frequence) {
        this.newspaperName = newspaperName;
        this.price = price;
        this.day = day;
        this.paperSize = paperSize;
        this.material = material;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(int paperSize) {
        this.paperSize = paperSize;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    boolean  isCheap(Newspaper n){
        boolean b = true;
        if (n.getPrice() <=5){
            b=true;
        }
        else {
            b=false;
        }
        return b;
    }

    public void isRecyclable() {
        if (material == "carton"){
            System.out.println("Cartonul este reciclabil deci Ziarul este reciclabil !!! ");
        }
    }

    public void isRefundable() {
        if (day =="Sunday" ){

        }
        else{
            System.out.println("This Chocolate ain;t refundable");
        }
    }public void read() {
    }

    public void enGross() {
    }

    public String getNewspaperName() {
        return newspaperName;
    }

    public void setNewspaperName(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "newspaperName='" + newspaperName + '\'' +
                ", price=" + price +
                '}';
    }

    public void fitInPocket() {
        if (paperSize < 10*4){
            System.out.println(" This newspaper folded in 4 fits in the pocket ");
        }
    }

    public String country(String language){
        String c = "Nobody's Country";
        if (language == "english" || language == "scotish" || language == "welsh"){
                c = "UK";
        }
        else if (language == "romanian" || language == "moldavian"){
            c= "Romania";
        }
        return c;
    }

    public void isEuropean() {
        if (country(language) == "Romania" || country(language) == "UK"){
            System.out.println(newspaperName + " is being read in " + country(language) + " which is in Europe");
        }
    }

    public void whatType(){
        if (frequence =="weekly"){
            System.out.println("Acesta este un ziar care apare saptamanal in ziua de "+ day);
        }
        else if (frequence =="monthly"){
            System.out.println("Acesta este un ziar care apare lunar");
        }
        else if (frequence =="biweekly"){
            System.out.println("Acesta este un ziar care apare la doua saptamani in ziua de " + day);
        }
        else if (frequence =="daily"){
            System.out.println("Acesta este un ziar care apare zilnic");
        }
    }

    public void whatPromotion() {

    }
}
