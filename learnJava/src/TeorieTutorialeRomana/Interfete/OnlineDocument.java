package TeorieTutorialeRomana.Interfete;

class OnlineDocument implements Document{
    String onlineResource;
    int price;

    OnlineDocument() {
    }

    OnlineDocument(String onlineResource) {
        this.onlineResource = onlineResource;
    }

    OnlineDocument(int price) {
        this.price = price;
    }

    OnlineDocument(String onlineResource, int price) {
        this.onlineResource = onlineResource;
        this.price = price;
    }

    String getOnlineResource() {
        return onlineResource;
    }

    void setOnlineResource(String onlineResource) {
        this.onlineResource = onlineResource;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void isFree(){

    }

    public void read(){
        System.out.println("We're reading the online document");
    }

    @Override
    public String toString() {
        return "OnlineDocument{" +
                "onlineResource='" + onlineResource + '\'' +
                ", price=" + price +
                '}';
    }
}
