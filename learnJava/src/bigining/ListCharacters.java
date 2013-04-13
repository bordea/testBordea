package bigining;

import java.util.Random;

public class ListCharacters {
    public static void main(String[] args) {
        /*for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c))
                System.out.println("value: " + (int)c + " character: " + c);*/
// Exercise 1: (1) Write a program that prints values from 1 to 100.
        /*for (byte a = 1; a<101; a++) {
            System.out.println(a);
        }  */
//Exercise 2: (2) Write a program that generates 25 random int values. For each value, use an if-else statement to classify
// it as greater than, less than, or equal to a second randomly generated value.
        for (byte b=1; b<26; b++){
            Random RandomGen = new Random ();
            int v1 = RandomGen.nextInt(20);
            int v2 = RandomGen.nextInt(10);
            if (v1 == v2)
                System.out.println(v1 + "   value1 = value2   " + v2);
            else if (v1 > v2)
                        System.out.println(v1 + "   value1 > value2   " + v2);
                 else System.out.println(v1 + "   value1 < value2   " + v2);

        }

    }
}
