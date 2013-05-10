package Boxing;

import java.util.ArrayList;

public class Autoboxing {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            list.add(i);                                    // Autoboxing fara new Integer
        }

    }

}
