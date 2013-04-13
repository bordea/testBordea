package bigining;

//Exercise 7: (3) Write a program that simulates coin-flipping.

import java.util.Random;

public class CoinFlipping {
    public static void main(String[] args) {
        Random rand = new Random(3);
        int i = rand.nextInt(3);

        System.out.println("i= " + i );

        System.out.println("Heads " + (i == 1));     // Heads if odd

        System.out.println("Tails " + (i != 1));     // Tails id even

    }
}
