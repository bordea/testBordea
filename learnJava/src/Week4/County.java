package Week4;

import java.util.Arrays;

public class County {
    protected City[] cities;
    protected String tara;
    protected String oras;

    public County(){}

    public County(City[] cities, String tara, String oras){
        this.cities = cities;
        this.tara = tara;
        this.oras = oras;
    }



    public County(City[] cities, String oras){
        this.cities = cities;
        this.oras = oras;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    @Override
    public String toString() {
        return "County{" +
                "cities=" + Arrays.toString(cities) +
                ", tara='" + tara + '\'' +
                ", oras='" + oras + '\'' +
                '}';
    }
}
