package operators;

public class SwitchExample {

    public static boolean isBetween(int x, int lower, int upper) {     // metoda returneaza true daca x ese intre lower si upper
        return lower <= x && x <= upper;            // returneaza true daca rezultatul ambelor testari este true
    }

    public static void main(String args[]){
        int num = 4;

        if (isBetween(num, 1, 5)) {
            System.out.println("testing case 1 to 5");
        }
        else if (isBetween(num, 6, 10)) {
            System.out.println("testing case 6 to 10");
        }

        switch(num){
            case 1 :                // case 1 .. 5 :
                System.out.println("testing case 1 to 5");
                break;
            case 2 :                // case 6 .. 10 :
                System.out.println("testing case 6 to 10");
                break;
        }
    }
}
