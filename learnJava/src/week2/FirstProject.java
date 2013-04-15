package week2;

public class FirstProject{
    static void StringVariables(String a, String b){
        System.out.println("The Name is " + a + " and the Surname is " + b);
    }
    public static void main(String args[]){
        int firstN = 10, secondN = 15, totalN;
        totalN = firstN + secondN;
        System.out.println("The First number is " + firstN);
        System.out.println("The Second number is " + secondN);
        System.out.println("The Total is " + totalN);
        String str1="Bordea", str2 = " David";
        StringVariables(str1, str2);
    }
}
