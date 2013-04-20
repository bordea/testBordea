package Week4;

import java.util.Arrays;

public class City {
    protected County judet;
    protected String name;
    double brut = 0.0d;
    int population;
    int surface;

    public City(){}

    public City(County judet,String name,double brut, int population,int surface){
        this.judet = judet;
        this.name = name;
        this.brut = brut;
        this.population = population;
        this.surface = surface;
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

    public double getBrut() {
        return brut;
    }

    public void setBrut(double brut) {
        this.brut = brut;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "City{" +
                "judet=" + judet +
                ", name='" + name + '\'' +
                ", brut=" + brut +
                ", population=" + population +
                ", surface=" + surface +
                '}';
    }
}
