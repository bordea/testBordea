package bigining;

public class ForEachString {
    public static void main(String[] args) {
        for(char c : "An African Swallow".toCharArray() )
            System.out.print(c + " ");

        System.out.println();

        for (char cc : "Spatiu".toCharArray())
            System.out.print(cc+".");
    }
}
