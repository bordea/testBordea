package week2;

import java.util.Scanner;

public class FirstProject{
    static void StringVariables(String a, String b,char c){
        System.out.println("The Name is " + a + ", the middle initial is " + c + " and the Surname is " + b);
    }
    static void StringVar(){
        Scanner user_input = new Scanner( System.in );
        String first_name, family_name, initial, full_name;
        System.out.print("First Name: ");
        first_name = user_input.next( );
        System.out.print("Your initial: ");
        initial = user_input.next( );
        System.out.print("Family name: ");
        family_name = user_input.next( );
        full_name = first_name + " " + initial + " " + family_name;
        System.out.println("You are " + full_name);
    }
    public static void main(String args[]){
        int firstN = 10, secondN = 15, totalN;
        totalN = firstN + secondN;
        System.out.println("The First number is " + firstN);
        System.out.println("The Second number is " + secondN);
        System.out.println("The Total is " + totalN);
        String str1="Bordea", str2 = "David";
        char c1 = 'C';
        StringVariables(str1, str2,c1);
        StringVar();

    }
}
