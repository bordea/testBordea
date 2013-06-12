package operators;

public class promotion {
    public static void main(String args[]){
        int i=0;
        short s=11;
        char c='v';
        byte b=127;
        i = b + c + s;
        System.out.println("i --> " + i + " ||| with c = " + (int)c);
        System.out.println(c);

        int j=50;
        short h=55;
        char a='v';
        byte y=87;
        j = h + a + y;
        System.out.println("j --> " + j);
        h = (short) j;
        System.out.println("h --> " + h);
        a = (char) j;
        System.out.println("a --> " + a);
        y = (byte) j;
        System.out.println("y --> " + y);
    }
}
