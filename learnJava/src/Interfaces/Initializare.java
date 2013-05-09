package Interfaces;

interface RandVals {
    int RANDOM_INT = 10;
    long RANDOM_LONG = 1010;
    float RANDOM_FLOAT = 10010;
    double RANDOM_DOUBLE = 20110;
}
public class Initializare {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);
    }
}