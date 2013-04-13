package bigining;

public class CommaOperator {
    public static void main(String[] args) {
        for(int i = 0, j = 0; i < 7; i++, j = i * 2) {
            System.out.println("i = " + i + "    " + j + " = j ");
        }
    }
}
