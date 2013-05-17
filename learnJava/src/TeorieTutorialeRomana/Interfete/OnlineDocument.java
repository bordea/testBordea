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

    boolean isFree(Document od){
        boolean free = true;
        if ( this.price == 0){
            System.out.println("FREE FREE FREE");
            free = true;
        }
        else {
            System.out.println("FREE FREE FREE");
            free = false;
        }
        return free;
    }

    public void read(){
        System.out.println("We're reading the online document from " + onlineResource);
    }

    @Override
    public String toString() {
        return "OnlineDocument{" +
                "onlineResource='" + onlineResource + '\'' +
                ", price=" + price +
                '}';
    }

    public void enGross() {
        System.out.println("This object can be sold EN-GROSS");
    }
}
