package TeorieTutorialeRomana.Interfete;

public class Newspaper implements Document,Packaging,Size {
    String newspaperName;
    int price;
    String day;
    int paperSize;
    String material;

    public Newspaper() {}

    public Newspaper(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public Newspaper(int price) {
        this.price = price;
    }

    public Newspaper(String newspaperName, int price, String day, int paperSize,String material) {
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
}
