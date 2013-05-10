package Enum;

public class WeekEnum{
    public enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args){
        Day today = Day.THURSDAY;
        printDayGreeting(today);
    }

    public static void printDayGreeting(Day today){
        if (today == Day.FRIDAY){
            System.out.println("Thanks God is Friday ");
        }
        else{
            System.out.println("Some other day other than Friday");
        }
    }

}
