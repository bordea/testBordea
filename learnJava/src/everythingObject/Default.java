package everythingObject;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 5/27/13
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Default {

    boolean memeberValue;

    public static void main(String[] args){


        boolean val;
//        System.out.println("default pt boolean:  " + val);   // this will not compile, only class memeber get default values

//        System.out.println("default pt boolean:  " + memeberValue);       // this will not work, we are in static comtext/mmethod

        Default aDefault = new Default();
        System.out.println("default pt boolean:  " + aDefault.memeberValue);
    }
}
