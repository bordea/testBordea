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
    }
}
