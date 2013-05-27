package everythingObject;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 5/27/13
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Default {

    boolean booleanValue;
    char caracter;
    byte baitul;
    short sort;
    int ingegerul;
    long lung;
    float flot;
    double dublu;

    public static void main(String[] args){
        boolean val;
//        System.out.println("default pt boolean:  " + val);   // this will not compile, only class memeber get default values

//        System.out.println("default pt boolean:  " + memeberValue);       // this will not work, we are in static comtext/mmethod

        Default aDefault = new Default();

        System.out.println("default pt BOOLEAN:  " + aDefault.booleanValue);
        System.out.println("default pt CHAR:  " + aDefault.caracter);
        System.out.println("default pt BYTE:  " + aDefault.baitul);
        System.out.println("default pt SHORT:  " + aDefault.sort);
        System.out.println("default pt INT:  " + aDefault.ingegerul);
        System.out.println("default pt LONG:  " + aDefault.lung);
        System.out.println("default pt FLOAt:  " + aDefault.flot);
        System.out.println("default pt DOUBLE:  " + aDefault.dublu);

    }
}
