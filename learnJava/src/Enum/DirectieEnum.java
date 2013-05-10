package Enum;

public class DirectieEnum {
    public enum Directie
    {
        TOP, RIGHT, BOTTOM, LEFT
    }

    public static void main(String[] args)
    {
        int i = 1;

        for (Directie d: Directie.values()){
            System.out.println("Directie " + i++ + " " + d);
        }
    }
}
