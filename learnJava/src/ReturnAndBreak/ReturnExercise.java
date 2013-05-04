package ReturnAndBreak;

import java.util.*;

public class ReturnExercise{
    static String test(int testval, int limUpp, int limLow) {
        if(testval >= limUpp)
            return "Three digits number at least";
        else if((testval <limUpp) &&(testval >=limLow))
            return  "Two digits number";
        else if ((testval<limLow) && (testval>=0))
            return  "Single digit number";
        else
            return "eroare";
    }

    static Integer testMax(int a,int b,int c,int d){
        if ((a >= b) && (a>=c) && (a>=d) )
            return a;
        else if((b >= a) && (b>=c) && (b>=d))
            return  b;
        else if ((c >= a) && (c>=b) && (c>=d))
            return  c;
        else
            return d;
    }

    public static void main(String[] args) {
        System.out.println(test(7,100,10));
        System.out.println(test(500,100,10));
        System.out.println(test(55,100,10));
        System.out.println(test(-23,100,10));
        System.out.println(testMax(5,60,3,18));
    }
}

