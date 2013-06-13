package operators;

public class ForEachString {
    public static void main(String[] args) {
        for(char c : "String with For Each".toCharArray() )
            System.out.print(c + " ");
    }
}
