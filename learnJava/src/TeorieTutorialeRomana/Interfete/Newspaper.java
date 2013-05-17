package TeorieTutorialeRomana.Interfete;

public class Newspaper implements Document {
    String newspaperName;
    int price;

    public Newspaper() {}

    public Newspaper(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    public Newspaper(int price) {
        this.price = price;
    }

    public Newspaper(String newspaperName, int price) {
        this.newspaperName = newspaperName;
        this.price = price;
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


    public void read() {
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

}
