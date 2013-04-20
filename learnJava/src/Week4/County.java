package Week4;

import java.util.Arrays;

public class County {
    protected City[] cities;
    protected String tara;
    protected String name;
    protected int population;

    public County(){}

    public County(City[] cities, String tara, String name, int population){
        this.cities = cities;
        this.tara = tara;
        this.name = name;
        this.population = population;
    }

    public County(City[] cities, String name, int population){
        this.cities = cities;
        this.name = name;
        this.population = population;
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

    public String getName() {
        return name;
    }

    public void setName(String oras) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "County{" +
//                "cities=" + Arrays.toString(cities) +
                ", tara='" + tara + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
