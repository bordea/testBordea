package week2;
// http://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
public class CLW {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 40;
        int div = 0;
        for (int number = lowerbound; number <= upperbound; number++) {

            if ((number % 3)==0) {
                System.out.print("3");
                div++;
            }

            if ((number % 5)==0) {
                System.out.print( "5");
                div++;
            }

            if ((number % 7)==0) {
                System.out.print( "7");
                div++;
            }
            // Print the number if it is not divisible by 3, 5 and 7
            if (div!=0) {
                System.out.print( " ");
            }

            if ((number % 11)==0) {
                System.out.println(" || " + number + " is an Eleven multiple || ");
            div = 0;
            }
        }
    }
}
