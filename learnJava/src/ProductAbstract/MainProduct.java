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

        DelicatFoof cremesh = new DelicatFoof();
        cremesh.setId("5f6q");
        cremesh.setPrice(2.54);
        cremesh.setName("CREMESH");
        cremesh.setKg(3);
        cremesh.setAroma("foarte dulce");

        cookie.description();

        DelicatFoof cheesecake = new DelicatFoof();
        cheesecake.setId("8u9i");
        cheesecake.setPrice(2.65);
        cheesecake.setName("CHEESECAKE");
        cheesecake.setKg(5);
        cheesecake.setAroma("amar");

        cookie.description();

        DelicatFoof liquerice = new DelicatFoof();
        liquerice.setId("5t6y");
        liquerice.setPrice(4);
        liquerice.setName("LIQUERICE");
        liquerice.setKg(3);
        liquerice.setAroma("amar");

        cookie.description();

        DelicatFoof fruitSalad = new DelicatFoof();
        fruitSalad.setId("8u4h");
        fruitSalad.setPrice(3.5);
        fruitSalad.setName("FruitSalad");
        fruitSalad.setKg(4);
        fruitSalad.setAroma("dulce");

        cookie.description();

        DelicatFoof cheeeseCrackers = new DelicatFoof();
        cheeeseCrackers.setId("9i5g");
        cheeeseCrackers.setPrice(3.05);
        cheeeseCrackers.setName("CHEESECRACKERS");
        cheeeseCrackers.setKg(2);
        cheeeseCrackers.setAroma("amar");

        cookie.description();

        Product[] products = new Product[10];
        products[0] = fard;
        products[1] = site;
        products[2] = boot;
        products[3] = greenCucumber;
        products[4] = cookie;
        products[5] = cremesh;
        products[6] = cheesecake;
        products[7] = liquerice;
        products[8] = fruitSalad;
        products[9] = cheeeseCrackers;








    }
}
