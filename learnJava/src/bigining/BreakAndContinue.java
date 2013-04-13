package bigining;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {                              // cauta multiplii lui 9 mai mici de 74
            if(i == 74) break; // Out of for loop
            if(i % 9 != 0) continue; // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();
                                // cauta multiplii lui 9 mai mici de 74 Using foreach:
        int[] array1 = new int[100];
        for (int i=1; i<100; i++)
            array1[i] = i;
        for(int i : array1) {
            if(i == 74) break; // Out of for loop
            if(i % 9 != 0) continue; // Next iteration
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
                                    // An "infinite loop":
        while(true) {
            i++;
            int j = i * 5;
            if(j == 205) break; // Out of loop
            if(i % 10 != 0) continue; // Top of loop
            System.out.print(i + " ");
        }
    }
}