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

        Castraveti greenCucumber = new Castraveti();
        greenCucumber.setId("7g8h");
        greenCucumber.setPrice(0.87);
        greenCucumber.setName("CASTRAVETE VERDE");
        greenCucumber.setKg(1);
        greenCucumber.setRedus(true);

        greenCucumber.description();

        DelicatFoof cookie = new DelicatFoof();
        cookie.setId("3e1g");
        cookie.setPrice(1.35);
        cookie.setName("COOKIE");
        cookie.setKg(4);
        cookie.setAroma("dulce");

        cookie.description();







    }
}
