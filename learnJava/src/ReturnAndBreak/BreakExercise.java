//Exercise 7: (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.

package ReturnAndBreak;

import java.util.ArrayList;

public class BreakExercise {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i == 99) break;                          // Out of for loop
            if(i % 9 != 0) continue;                    // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<Integer>();              //same thing with FOR EACH
        for (int i=0; i<101;i++){
            list.add(i);
        }
        for(int i : list) {
            if(i == 99) break;                          // Out of for loop
            if(i % 9 != 0) continue;                    // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i: list){
            if (i == 60) {
                break;
            }
            System.out.print(i + " ");
        }

// An "infinite loop":
/*          int i = 0;
            while(true) {
            i++;
            int j = i * 27;
            if(j == 1269) break;                        // Out of loop
            if(i % 10 != 0) continue;                   // Top of loop
            System.out.print(i + " ");
        }*/
    }
}
