package operators;

public class UncondBranch {

    public static void main(String args[]){
        int[] engineSize =  {1200,2000,1750,1800,1980,2040,3000,5000};

        for (int engine:engineSize){
            testareMasini(engine);
        }

        for(int i = 123456789; i > 2000; i=i/13) {
            if (i%3==0){
                System.out.println("Numar divizilbil cu 3 --> "+ i);
            }
        }
        for(int i = 123456789; i > 2000; i=i/13) {
            if (i%3==0){
                System.out.println("Numar divizilbil cu 3 --> "+ i);
                break;
            }
        }

        for(int i = 123456789; i > 2000; i=i/13) {
            if (i%4>0){
                continue;

            }
            System.out.println("Numar divizilbil cu 4 --> "+ i);
        }
        for(int i = 123456789; i > 2000; i=i/13) {
            if (i%4>0){
                continue;

            }
            System.out.println("Numar divizilbil cu 4 --> "+ i);
        }
    }

    public static String testareMasini(int i){
        if (i>1800){
            if (i>5000){
                return "Masina de mers pe orbita";
            }
            else return "Masina de vitezomani";
        }
        else return "Masina de melci";
    }
}
