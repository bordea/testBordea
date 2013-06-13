package operators;

public class ForEachString {
    public static void main(String[] args) {

        for(char c : "String with For Each".toCharArray() )
            System.out.print(c + " ");

        System.out.println();
        String[] ingredients = {"Branza", "Slanina", "Carnat"};

        for (String ss: ingredients)
        {
            System.out.println(ss);
        }

        String[ ][ ] orase = {
                { "Cluj", "Arad", "BaiaMare", "Bucuresti"},
                { "Belfast", "Manchester", "Dublin", "Londra" },
                { "Texas", "Detroit", "Atlanta" }
        };

        for (int i = 0; i < orase.length; i++)
        {
            System.out.print(orase[i][0] + " ");
            for (int j = 1; j<orase[i].length; j++)
            {
                System.out.print(orase[i][j] + " ");
            }
            System.out.println();
        }
    }


}
