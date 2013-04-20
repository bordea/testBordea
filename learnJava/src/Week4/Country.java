package Week4;

import java.util.Arrays;

public class Country {
    protected County[] county;
    protected String name;
    protected int pop;

    public Country() {} ;

    public Country (County [] county, String name, int pop){
        this.county = county;
        this.name = name;
        this.pop = pop;
    }

    public Country(County[] county, String name){
        this.county = county;
        this.name = name;
    }

    public Country (County[] county, int pop){
        this.county = county;
        this.pop = pop;
    }

    public County[] getCounty() {
        return county;
    }

    public void setCounty(County[] county) {
        this.county = county;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Country{" +
                "county=" + Arrays.toString(county) +
                ", name='" + name + '\'' +
                ", pop=" + pop +
                '}';
    }
}
