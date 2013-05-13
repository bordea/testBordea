package TeorieTutorialeRomana;

public class Instructiuni {
    public static void main(String args[]) {
        int[] numbers= new int[]{1,2,3,4,5,6,78,9,10,11,12,13,14,15,16,17,18,19};
        int sum = 0, i = 0;
        while (i< numbers.length){
            System.out.println(i);
            if(i == 5){
                System.out.println("BREAK si parasim iteratia");
                break;
            }
            i++;
            if(i%2 != 0){
                sum = sum + i;
                System.out.println("CONTINUE deci trecem la urmatorul step in iteratie");
                continue;
            }
            System.out.println("Numar impar --> " + i);
        }
        System.out.println("Suma numere pare pana la 15 -->  " + sum);
    }


}
