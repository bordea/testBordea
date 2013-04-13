package bigining;

import java.util.*;

public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for(int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for(float x : f)     //This defines a variable x of type float and sequentially assigns each element of f to x.
            System.out.println(x);


    }
}
