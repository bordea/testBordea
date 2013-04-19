package Week4;

import java.util.Arrays;

public class Continent {
    String name;
    Country[] tara;
    int code;

    public Continent(){}

    public Continent(String name, Country[] tara, int code){
        this.name = name;
        this.tara = tara;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", tara=" + Arrays.toString(tara) +
                ", code=" + code +
                '}';
    }
}
