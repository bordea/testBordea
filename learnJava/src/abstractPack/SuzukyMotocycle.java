package abstractPack;

import java.util.Date;

public class SuzukyMotocycle extends Motocycle{

    Date bestSpeed;

    public SuzukyMotocycle() {}

    public void makeNoise() {
        System.out.println("SuzukyMotocycle noise");
    }

    public void standBackWheels(){
        System.out.println("This Autovehicle can stand on its back wheels");
    }

    public Date getBestSpeed() {
        return bestSpeed;
    }

    public void setBestSpeed(Date bestSpeed) {
        this.bestSpeed = bestSpeed;
    }

    public void standOnbackWheel(){
        System.out.println("crazy stuff" + bestSpeed);
    }

    @Override
    public String toString() {
        return "SuzukyMotocycle{" +
                "bestSpeed=" + bestSpeed +
                '}';
    }
}
