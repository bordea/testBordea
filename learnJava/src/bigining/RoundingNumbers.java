package bigining;

public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;                    //round( ) is part of java.lang so no import needed for it
        System.out.println(above + "Math.round(above): " + Math.round(above));
        System.out.println(below + "Math.round(below): " + Math.round(below));
        System.out.println(fabove + "Math.round(fabove): " + Math.round(fabove));
        System.out.println(fbelow + "Math.round(fbelow): " + Math.round(fbelow));

        //when assigning info back the cast will be needed and info might be lost

    }
}
