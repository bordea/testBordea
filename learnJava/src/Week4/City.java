package Week4;

import java.util.Arrays;

public class City {
    protected County judet;
    protected String name;

    public City(){}

    public City(County judet,String name){
        this.judet = judet;
        this.name = name;
    }

    public County getJudet() {
        return judet;
    }

    public void setJudet(County judet) {
        this.judet = judet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "judet=" + judet +
                ", name='" + name + '\'' +
                '}';
    }
}
