package Week4;

import java.util.Arrays;

public class City {
    Country[] tara;
    County[] judet;

    public City(){}

    public City(Country[] array1, County[] array2){
        this.tara = array1;
        this.judet = array2;
    }

    @Override
    public String toString() {
        return "City{" +
                "tara=" + Arrays.toString(tara) +
                ", judet=" + Arrays.toString(judet) +
                '}';
    }
}
