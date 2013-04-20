package abstractPack;


public class Volvo extends Car{

    int safety;

    public Volvo() {}

    @Override
    public void makeNoise() {
        System.out.println("Volvo noise "  );
    }

    public int getSafety() {
        return safety;
    }

    public void setSafety(int safety) {
        this.safety = safety;
    }
}
