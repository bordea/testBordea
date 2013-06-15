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
            case 1 :
                System.out.println("testing case 1");
                break;
            case 2 :
                System.out.println("testing case 2");
                break;
            case 3 :
                System.out.println("testing case 3");
                break;
            case 4 :
                System.out.println("testing case 4");
                break;
            case 5 :
                System.out.println("testing case 5");
                break;
            case 6 :
                System.out.println("testing case 6");
                break;
            case 7 :
                System.out.println("testing case 7");
                break;
            case 8 :
                System.out.println("testing case 8");
                break;
            case 9 :
                System.out.println("testing case 9");
                break;
            case 10 :
                System.out.println("testing case 10");
                break;
        }

        int age = 55;

        switch (age){
            case 18:
                System.out.println("Ai 18 ani");
                break;
            case 30:
                System.out.println("Ai 30 ani");
                break;
            case 55:
                System.out.println("Ai 55 ani");
                break;
        }
    }
}
