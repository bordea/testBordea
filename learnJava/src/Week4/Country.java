package Week4;

import java.util.Arrays;

public class Country {
    protected County[] counties;
    protected String name;
    protected int pop;

    public Country() {} ;

    public Country (County [] counties, String name, int pop){
        this.counties = counties;
        this.name = name;
        this.pop = pop;
    }

    public Country(County[] counties, String name){
        this.counties = counties;
        this.name = name;
    }

    public Country (County[] counties, int pop){
        this.counties = counties;
        this.pop = pop;
    }

    public County[] getCounties() {
        return counties;
    }

    public void setCounties(County[] counties) {
        this.counties = counties;
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
                "county=" + Arrays.toString(counties) +
                ", name='" + name + '\'' +
                ", pop=" + pop +
                '}';
    }
}
