package week2;

import java.util.Scanner;

public class FirstProject{
    static void TheVeryFirst(){
        int firstN = 10, secondN = 15, totalN;
        totalN = firstN + secondN;
        System.out.println("The First number is " + firstN);
        System.out.println("The Second number is " + secondN);
        System.out.println("The Total is " + totalN);
    }
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
    static void AgeGroup(){
        Scanner user_input = new Scanner( System.in );
        int age;
        System.out.print("How old are you? ");
        age = user_input.nextInt();
        switch (age){
            case 0:case 1 :case 2:case 3:case 4:case 5:case 6:
                System.out.println("You are yet to go to school");
                break;
            case 7:case 8:case 9:case 10:
                System.out.println("You are in primary school");
                break;
            case 11:case 12:case 13:case 14:
                System.out.println("You are in secondary school");
                break;
            default:
                System.out.println("You have finished gymnasium");

        }
    }
    public static void main(String args[]){
        TheVeryFirst();
        String str1="Bordea", str2 = "David";
        char c1 = 'C';
        StringVariables(str1, str2,c1);
        StringVar();
        AgeGroup();
    }
}
