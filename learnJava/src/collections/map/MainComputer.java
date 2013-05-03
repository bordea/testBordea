package collections.map;

import java.util.*;

public class MainComputer {
    public static void main(String args[]){
        Keyboard k1 = new Keyboard(11,"Tastatura Intel 1111","European","Intel");
        Keyboard k2 = new Keyboard(12,"Tastatura IBM 2222","Chinese","IBM");
        Keyboard k3 = new Keyboard(13,"Tastatura Intel 5432","American","Intel");
        Keyboard k4 = new Keyboard(14,"Tastatura HP 3333","European","HP");
        Keyboard k5 = new Keyboard(15,"Tastatura Intel Wireless 1234","American","Intel");
        ArrayList<Keyboard> k = new ArrayList<Keyboard>();
        k.add(k1);
        k.add(k2);
        k.add(k3);
        k.add(k4);
        k.add(k5);
        for (int i=0;i< k.size();i++){
            Keyboard keyb = k.get(i);
            System.out.println(keyb);
            keyb.isEuropean(keyb);
        }

        Mouse m1 = new Mouse(444,"Intel Mouse with 3 buttons",2);
        Mouse m2 = new Mouse(401,"IBM Mouse with 3 buttons",2);
        Mouse m3 = new Mouse(493,"Intel Mouse with 2 buttons",0);
        Mouse m4 = new Mouse(426,"Intel Mouse with 2 buttons",0);
        Mouse m5 = new Mouse(456,"Intel Mouse with 3 buttons",2);
        ArrayList<Mouse> m = new ArrayList<Mouse>();
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        m.add(m5);
        for (int i=0;i< m.size();i++){
            Mouse mou = m.get(i);
            System.out.println(mou);
            mou.isWireless(mou);
        }

        Monitor mon1 = new Monitor(102,"Monitor IBM cu ecran vechi",17,2.5);
        Monitor mon2 = new Monitor(602,"Monitor Toshiba cu ecran plat",19,0.9);
        Monitor mon3 = new Monitor(305,"Monitor IBM cu ecran plat",17,2.5);
        Monitor mon4 = new Monitor(609,"Monitor Dell cu ecran plat",17,2.2);
        Monitor mon5 = new Monitor(105,"Monitor HP cu ecran plat",21,1.1);
        ArrayList<Monitor> mon = new ArrayList<Monitor>();
        mon.add(mon1);
        mon.add(mon2);
        mon.add(mon3);
        mon.add(mon4);
        mon.add(mon5);
        for (int i=0;i< mon.size();i++){
            Monitor monitor = mon.get(i);
            System.out.println(monitor);
            monitor.isFlat(monitor);
        }


    }
}
