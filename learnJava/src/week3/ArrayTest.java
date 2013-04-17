package week3;

class ArrayTest {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers , the number of integers goes into the square brackets
        anArray = new int[10];

        // initialize first element, on the position 9
        anArray[0] = 100;
        // initialize second element, on the position 1
        anArray[1] = 20;
        anArray[2] = 300;
        anArray[3] = 40;
        anArray[4] = 500;
        anArray[5] = 60;
        anArray[6] = 700;
        anArray[7] = 80;
        anArray[8] = 900;
        anArray[9] = 100;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);
    }
}

