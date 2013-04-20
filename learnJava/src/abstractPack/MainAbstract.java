package abstractPack;

import java.util.Date;

public class MainAbstract {

    public static void main(String args[]){
//       Autovehicle autovehicle1 = new Autovehicle();   not allowed

//        Motocycle motocycle =new Motocycle();   // not allowwed new for abstract classes

        SuzukyMotocycle suzukyMotocycle = new SuzukyMotocycle();
        // set autovehicle properties
        suzukyMotocycle.setCarModel("suzuky");
        suzukyMotocycle.setSpeed(300);
        suzukyMotocycle.setColor("blue");
        suzukyMotocycle.setNumofGears(5);
        suzukyMotocycle.setNumberOfWheels(2);
        // set motorcycle properties
        suzukyMotocycle.setNrofpassangers(1);
        //set suzukyMotocycle properties
        suzukyMotocycle.setBestSpeed(new Date(2000, 1, 1));

        System.out.println(suzukyMotocycle);
        suzukyMotocycle.makeNoise();


        Bmw radusBmw = new Bmw();
        // set autovehicle properties
        radusBmw.setCarModel("radusBmw");
        radusBmw.setSpeed(200);
        radusBmw.setColor("blue");
        radusBmw.setNumofGears(7);
        radusBmw.setNumberOfWheels(4);
        // set car properties
        radusBmw.setNumberofdoors(5);
        //set radusBmw properties
        radusBmw.setCanDrift(true);

        System.out.println(radusBmw);
        radusBmw.makeNoise();

        VW vw = new VW();
        // set autovehicle properties
        vw.setCarModel("vw");
        vw.setSpeed(300);
        vw.setColor("blue");
        vw.setNumofGears(6);
        vw.setNumberOfWheels(2);
        // set car properties
        vw.setNumberofdoors(3);
        //set vw properties
        vw.setRezistenta(20);

        System.out.println(vw);
        vw.makeNoise();

        RudimentaryVehicle rudimentaryVehicle = new RudimentaryVehicle();
        // set autovehicle properties
        rudimentaryVehicle.setCarModel("vehicle rudimentary");
        rudimentaryVehicle.setSpeed(0);
        rudimentaryVehicle.setColor("blue");
        rudimentaryVehicle.setNumofGears(6);
        rudimentaryVehicle.setNumberOfWheels(2);

        Autovehicle[] autovehicles = new Autovehicle[10];  // nothing happends, no new Autovehicle is called.
        autovehicles[0] = suzukyMotocycle;
        autovehicles[1] = radusBmw;
        autovehicles[2] = vw;
        autovehicles[3] = rudimentaryVehicle;

        System.out.println("print all autovehicles-----------------------------");
        for(int i =0; i< autovehicles.length; i++){
            if(autovehicles[i] != null){
                Autovehicle autovehicle = autovehicles[i];
                autovehicle.makeNoise();
                System.out.println(autovehicle.getColor());
            }
        }

        Autovehicle almeuBMW = autovehicles[1];
        System.out.println("my radusBmw color "+almeuBMW.getColor());

        Car[] cars = new Car[3];
        cars[0]=radusBmw;
        cars[1]=vw;

        System.out.println("print all cars-----------------");
        for(int i =0; i< cars.length; i++){
            if(cars[i] != null){
                System.out.println(cars[i].getNumberofdoors());
            }
        }

        Bmw[] bmws = new Bmw[10];
        bmws[0]= radusBmw;
//        bmws[1]= cristiBwm;   //TODO


        System.out.println("print all bmw-----------------");
        for(int i =0; i< bmws.length; i++){
            if(bmws[i] != null){
                System.out.println(bmws[i].isCanDrift());
            }
        }


        // radusBMW is a bmw , but is also a car or a autovehicle
        Car radusBmwcar = radusBmw;                                   // locval variable that can be assign a value
                                                    // so radusbmw will behave like a car, because we defined as a car;
        Autovehicle radusBmwvehicle = radusBmw;


        Caruta carutaRadu = new Caruta();
        carutaRadu.setColor("bulibas color");
        carutaRadu.setCountHorse(10);
        System.out.println(carutaRadu);
        carutaRadu.makeNoise();

        RudimentaryVehicle rudeRadu = new RudimentaryVehicle();
        rudeRadu.setColor("unknow color");
        System.out.println(rudeRadu);
        rudeRadu.makeNoise();
    }
}
