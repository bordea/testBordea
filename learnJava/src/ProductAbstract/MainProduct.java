package ProductAbstract;

public class MainProduct {
    public static void main (String args[]){

        Cosmetic fard = new Cosmetic();
        fard.setId("1a2b");
        fard.setPrice(35.75);
        fard.setName("FARD");

        fard.description();

        WebSpace site = new WebSpace();
        site.setId("3c4d");
        site.setPrice(12.33);
        site.setName("WEBSITE");
        site.setSize(28);

        site.description();

        Shoes boot = new Shoes();
        boot.setId("5e6f");
        boot.setPrice(27.75);
        boot.setName("BOCANC");
        boot.setGender("Unisex");

        boot.description();



    }
}
