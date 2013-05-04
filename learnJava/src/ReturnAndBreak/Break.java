package ReturnAndBreak;

import java.util.ArrayList;

public class Break {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i == 74) break;                          // Out of for loop
            if(i % 9 != 0) continue;                    // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<Integer>();              //same thing with FOR EACH
        for (int i=0; i<101;i++){
            list.add(i);
        }
        for(int i : list) {
            if(i == 74) break;                          // Out of for loop
            if(i % 9 != 0) continue;                    // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
// An "infinite loop":
/*        while(true) {
            i++;
            int j = i * 27;
            if(j == 1269) break;                        // Out of loop
            if(i % 10 != 0) continue;                   // Top of loop
            System.out.print(i + " ");
        }*/
    }
}
