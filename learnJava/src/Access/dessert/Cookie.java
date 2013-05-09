package Access.dessert;

public class Cookie {
    public Cookie() {             // constructorul e public si clasa e publica inseamna ca putem crea un Cookie object in clasa Dinner
        System.out.println("Cookie constructor");
    }
    void bite() { System.out.println("bite"); }
}
