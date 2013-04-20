package abstractPack;

public class Caruta extends RudimentaryVehicle {

    int countHorse;

    public Caruta() {
    }

    @Override
    public void makeNoise() {                               // is not mandatory
        System.out.println("caruta noise ..." + countHorse + " magnitude");                                    //overiwrite la metoda din superclasa.parinte
    }

    public int getCountHorse() {
        return countHorse;
    }

    public void setCountHorse(int countHorse) {
        this.countHorse = countHorse;
    }
}
