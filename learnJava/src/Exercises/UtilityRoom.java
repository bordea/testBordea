package Exercises;

public class UtilityRoom extends Apartment{
    String boilerName, combustibil;

    public UtilityRoom() {
    }

    public UtilityRoom(int temperature) {
        super(temperature);
    }

    public UtilityRoom(int temperature, int numberOfRadiators) {
        super(temperature, numberOfRadiators);
    }

    public UtilityRoom(String boilerName, String combustibil) {
        this.boilerName = boilerName;
        this.combustibil = combustibil;
    }

    public UtilityRoom(int temperature, String boilerName, String combustibil) {
        super(temperature);
        this.boilerName = boilerName;
        this.combustibil = combustibil;
    }

    public UtilityRoom(int temperature, int numberOfRadiators, String boilerName, String combustibil) {
        super(temperature, numberOfRadiators);
        this.boilerName = boilerName;
        this.combustibil = combustibil;
    }

    public String getBoilerName() {
        return boilerName;
    }

    public void setBoilerName(String boilerName) {
        this.boilerName = boilerName;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "temperature=" + temperature +
                ", numberOfRadiators=" + numberOfRadiators +
                ", boilerName=" + boilerName +
                ", combustibil=" + combustibil +
                '}';
    }
}
