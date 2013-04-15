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
    static void Country(){
        Scanner user_input = new Scanner( System.in );
        String tara;
        System.out.print("Pick a country from romania, china, egipt, sua si peru: ");
        tara = user_input.next ();
        if (tara.equals("romania"))
            System.out.println("You're living in Europe");
        else if (tara.equals("china"))
            System.out.println("You're living in Asia");
             else if (tara.equals("egipt"))
                      System.out.println("You're living in Africa");
                  else if (tara.equals("sua"))
                            System.out.println("You're living in North America");
                       else if (tara.equals("peru"))
                                System.out.println("You're living in South America");
                            else System.out.println("You're illiterate!!!");
    }
    static void TimesTable(){
        for (int i = 1; i<9; i++){
            for (int j = 1; j<9; j++){
                System.out.print(i + " x " + j + " = " + (i*j) + "   |   ");
            }
            System.out.println();
        }
    }
    static void OddNumbers(){
        for (int i = 1; i<15; i++){
            if ((i%2)!=0)
                System.out.println(i + " is an odd number");
            else System.out.println(i + " is an even number");
        }
    }
    public static void main(String args[]){
/*        TheVeryFirst();
        String str1="Bordea", str2 = "David";
        char c1 = 'C';
        StringVariables(str1, str2,c1);
        StringVar();
        AgeGroup();
        Country(); */
        TimesTable();
        OddNumbers();
    }
}
