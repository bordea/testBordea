package bigining;

public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.79;  // Math.random returns a number between 0.0 and 1.0
        System.out.print(result + ", ");
    return result;
}
    public static void main(String[] args) {
        while(condition())
            System.out.println("Inside ‘while’");
        System.out.println("Exited ‘while’");
    }
}